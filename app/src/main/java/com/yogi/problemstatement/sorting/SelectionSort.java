package com.yogi.problemstatement.sorting;

public class SelectionSort {


    public int[] selectionSort(int array[]){

        int size=array.length;
        int minValueIndex=0;
        for (int i = 0; i < size; i++) {
            minValueIndex=i;

            for (int j = i+1; j < size; j++) {
                if(array[j]<array[minValueIndex]){
                    minValueIndex=j;
                }
            }
            int tempValue=array[i];
            array[i]=array[minValueIndex];
            array[minValueIndex]=tempValue;
        }


return array;
    }

    public void printValue(int[] array ){

        for (int i = 0; i < array.length; i++) {
            System.out.println(">>>>>>>>> "+array[i]);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int array[]=new int[]{2,4,3,7,5,6,1};
        selectionSort.selectionSort(array);
        selectionSort.printValue(array);
    }
}
