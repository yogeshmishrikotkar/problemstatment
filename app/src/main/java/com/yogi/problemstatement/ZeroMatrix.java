package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {


    public static void main(String[] args) {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int mat[][] = {
                {1,0,1},
                {1,1,1},
                {0,1,1}
                };


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        ArrayList<Integer> l3= new ArrayList<>();

        list.add(l1);
        list.add(l2);
        list.add(l3);

        l1.add(1);
        l1.add(0);
        l1.add(1);

        l2.add(1);
        l2.add(1);
        l2.add(1);

        l3.add(0);
        l3.add(1);
        l3.add(1);



         zeroMatrix.markZeroMatrix(list);

//        zeroMatrix.markZeroMatrix1(mat);



    }



    private void markZeroMatrix1(int[][] mat) {



        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            ArrayList a1= new ArrayList();
            for (int j = 0; j < mat[0].length; j++) {
                a1.add(mat[i][j]);
            }
            a.add(a1);
        }



        ArrayList<PairIndex> list = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int size = a.get(i).size();
            for (int j = 0; j < size; j++) {
                if(a.get(i).get(j)==0){
                    list.add(new PairIndex(i,j));
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {

            PairIndex pairIndex = list.get(i);

            int row = pairIndex.row;
            int column=pairIndex.column;

            for (int j = 0; j <a.size(); j++) {
                int size = a.get(j).size();
                for (int k = 0; k <  size; k++) {

                    if(j==row || column ==k){
                       // mat[j][k]=0;
                        a.get(j).set(k,0);
                    }
                }
            }
        }


        for (int j = 0; j < a.size(); j++) {
            System.out.println("");
            for (int k = 0; k < a.get(j).size(); k++) {
                System.out.print(""+a.get(k).get(k));
            }
        }


    }



    private void markZeroMatrix( ArrayList<ArrayList<Integer>> a/*int[][] matrix*/) {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;
        int m = a.size();
        int n = a.get(0).size();

        for (int i = 0; i < m; i++) {
            if (a.get(i).get(0) == 0) {
                firstColumnZero = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a.get(0).get(i) == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a.get(i).get(j) == 0) {
                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (a.get(i).get(0) == 0) {
                for (int j = 1; j < n; j++)
                    a.get(i).set(j,0);
            }
        }
        for (int i = 1; i < n; i++) {
            if (a.get(0).get(i) == 0) {
                for (int j = 1; j < m; j++)
                    a.get(j).set(i,0);
            }
        }
        if (firstRowZero) {
            for (int i = 0; i < n; i++)
                a.get(0).set(i,0);
        }
        if (firstColumnZero) {
            for (int i = 0; i < m; i++)
            a.get(i).set(0,0);
        }
        }

    class  PairIndex{

        int row;
        int column;

        public PairIndex(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

}
