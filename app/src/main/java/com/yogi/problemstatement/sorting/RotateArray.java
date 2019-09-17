package com.yogi.problemstatement.sorting;

import java.util.ArrayList;

public class RotateArray {

//shift array element to given number of times

//    ArrayList<Integer> performOps(ArrayList<Integer> A) {
//        ArrayList<Integer> B = new ArrayList<Integer>();
//        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
//        for (int i = 0; i < A.size(); i++) {
//
//            int temp1=(A.size() - i);
//            int size=A.size();
//            int mod=temp1%size;
//
//            System.out.println(mod + " >>> "+(i + A.size()));
//
//            B.set(i, A.get(i));
//            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
//        }
//        return B;
//    }



    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        for (int i = 0; i < B; i++) {
            leftRotateByOne(A,A.size());
        }

        return A;
    }

    public void leftRotateByOne(ArrayList<Integer> A , int n){

        ArrayList<Integer> ret = new ArrayList<Integer>();
        int i, temp=0;
        temp = A.get(0);;
        for (i = 0; i <n - 1; i++)
        {
            A.set(i,A.get(i+1));
        }
        A.set(i,temp);
    }



    public static void main(String[] args) {
        RotateArray array = new RotateArray();
       // 5, 10, 2, 1
        int input[]=new int[]{14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35 };
        ArrayList<Integer> f1= new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            f1.add(input[i]);
        }


        ArrayList<Integer> integers = array.rotateArray(f1, 2);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i) + " ");
        }


//        int input1[]=new int[]{ 5, 10, 2, 1};
//        ArrayList<Integer> f2= new ArrayList<>();
//
//        for (int i = 0; i < input1.length; i++) {
//            f2.add(input1[i]);
//        }
      //  array.performOps(f2);


//        ArrayList<Integer> B = array.performOps(f2);
//        for (int i = 0; i < B.size(); i++) {
//            System.out.print(B.get(i) + " ");
//        }


    }


}
