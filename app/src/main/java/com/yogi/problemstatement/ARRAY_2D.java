package com.yogi.problemstatement;

import java.util.ArrayList;

public class ARRAY_2D {




    ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }


    public static void main(String[] args) {
        ARRAY_2D array = new ARRAY_2D();

        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();

        ArrayList<Integer> f1= new ArrayList<>();
        f1.add(1);
        f1.add(2);
        f1.add(3);
        f1.add(4);
        list.add(f1);

        ArrayList<Integer> f2= new ArrayList<>();
        f2.add(5);
        f2.add(6);
        f2.add(7);
        f2.add(8);
        list.add(f2);

        ArrayList<Integer> f3= new ArrayList<>();
        f3.add(9);
        f3.add(10);
        f3.add(11);
        f3.add(12);
        list.add(f3);




        ArrayList<ArrayList<Integer>> B = array.performOps(list);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }


    }

}
