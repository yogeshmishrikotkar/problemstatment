package com.yogi.problemstatement;

public class InsertionSort {


    public static void main(String[] args) {
        int array[]=new int[]{7,2,4,1,5,3};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
        insertionSort.printValue(array);
    }

    private void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int hole=i ;
            int value =array[i];

            while (hole>0 && array[hole-1]>value){

                array[hole]=array[hole-1];

                hole=hole-1;
            }
            array[hole]=value;


        }




    }

    public void printValue(int[] array ){

        for (int i = 0; i < array.length; i++) {
            System.out.println(">>>>>>>>> "+array[i]);
        }
    }
}
