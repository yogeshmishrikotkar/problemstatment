package com.yogi.problemstatement;

import java.util.ArrayList;

//
//Pascal Triangle
//
//        Asked in:
//        Google
//        Amazon
//
//        Given numRows, generate the first numRows of Pascal’s triangle.
//
//        Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
//
//        Example:
//
//        Given numRows = 5,
//
//        Return
//
//        [
//        [1],
//        [1,1],
//        [1,2,1],
//        [1,3,3,1],
//        [1,4,6,4,1]
//        ]
//




//
//
//Given an index k, return the kth row of the Pascal’s triangle.
//
//        Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

public class PascalTrangle {

    public static void main(String[] args) {
        PascalTrangle pascalTrangle = new PascalTrangle();

        PascalTrangle.pascleTrangelWithArray(4);

        int A=4;
        ArrayList<ArrayList<Integer>> arrayLists = PascalTrangle.pascleTrangelWithArrayList(A+1);
        ArrayList<Integer> kthRowOfPascleTrangle = PascalTrangle.getKthRowOfPascleTrangle(arrayLists, A);
    }

    private static ArrayList<Integer> getKthRowOfPascleTrangle(ArrayList<ArrayList<Integer>> arrayLists, int k) {

        if(k==0){
            ArrayList<Integer> integers = arrayLists.get(0);
            if(integers==null){
                integers.add(1);
            }

            return integers;
        }

        ArrayList<Integer> integers = arrayLists.get(k);


        return integers;
    }

    private static ArrayList<ArrayList<Integer>> pascleTrangelWithArrayList(int number) {

        int count=0;
        ArrayList<ArrayList<Integer>> resultList= new ArrayList<>();


        ArrayList<Integer> tempList=null;
        for (int i = 0; i <number; i++) {
            count=0;
            tempList= new ArrayList<>();
            for (int j =0; j <=i ; j++) {
                tempList.add(1);
            }
            resultList.add(tempList);
        }

        count=0;

        for (int i = 1; i <number; i++) {
            count=1;
            for (int j =1; j <=i ; j++) {
                ArrayList<Integer> integers = resultList.get(i);
                integers.set(j,count*(i-j+1)/j);
                count=integers.get(j);
            }
        }

        return resultList;
    }

    private static void pascleTrangelWithArray(int number) {

        int count=0;
         int array[][]= new int[number][number];



        ArrayList<Integer> tempList=null;
        for (int i = 0; i <number; i++) {
            count++;
            for (int j =0; j <=i ; j++) {
                array[i][j]=1;
            }
        }

        count=0;

        for (int i = 1; i <number; i++) {
            count=1;
            for (int j =1; j <=i ; j++) {
                array[i][j]=count*(i-j+1)/j;
                count=array[i][j];
            }
        }

        for (int i = 0; i <array.length; i++) {
            count++;
             System.out.println(" ");
            for (int j =0; j <=i ; j++) {
                System.out.print(array[i][j]+" ");
            }
        }


    }

}
