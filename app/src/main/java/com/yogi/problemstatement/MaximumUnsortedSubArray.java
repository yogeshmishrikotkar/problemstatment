package com.yogi.problemstatement;

import java.util.ArrayList;
/*
You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
        Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
        If A is already sorted, output -1.

        Example :

        Input 1:

        A = [1, 3, 2, 4, 5]

        Return: [1, 2]

        Input 2:

        A = [1, 2, 3, 4, 5]

        Return: [-1]

*/

public class MaximumUnsortedSubArray {

    public static void main(String[] args) {
        MaximumUnsortedSubArray subArray =new MaximumUnsortedSubArray();


        subArray.findSubArray(new int[]{
                1, 3, 2, 4, 5
                /*1, 2, 3, 4, 5*//*10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60*/});
    }

    /*Solution:
            1) Find the candidate unsorted subarray
    a) Scan from left to right and find the first element which is greater than the next element. Let s be the index of such an element. In the above example 1, s is 3 (index of 30).
    b) Scan from right to left and find the first element (first in right to left order) which is smaller than the next element (next in right to left order). Let e be the index of such an element. In the above example 1, e is 7 (index of 31).

            2) Check whether sorting the candidate unsorted subarray makes the complete array sorted or not. If not, then include more elements in the subarray.
    a) Find the minimum and maximum values in arr[s..e]. Let minimum and maximum values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40 respectively.
            b) Find the first element (if there is any) in arr[0..s-1] which is greater than min, change s to index of this element. There is no such element in above example 1.
    c) Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max, change e to index of this element. In the above example 1, e is changed to 8 (index of 35)

            3) Print s and e.*/
    private int[] findSubArray(int[] array) {
        int s=0; int e=array.length-1; ;
        int min =0;
        int max =0;


        for (  s = 0; s < array.length-1; s++) {
            
            if(array[s]>array[s+1]){
               // s=i;
                break;
            }
        }


        if (s == array.length-1)
        {
           // System.out.println("The complete array is sorted");
            return new int[]{-1};
        }


        for (  e = array.length-1;e > 0; e--) {

            if(array[e]<array[e-1]){
                break;
            }
        }

        min=array[s];
        max=array[s];

        for (int i = s + 1; i <= e; i++) {

            if (array[i] > max) {
                max = array[i];
            }
           else if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i <s; i++) {

            if (array[i] > min) {
                s=i;
                break;
            }
        }

        for (int i = array.length-1; i >e; i--) {

            if (array[i] < max) {
                e=i;
                break;
            }
        }


        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(s);
        arrayList.add(e);

        int arr[]=new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            arr[i]=arrayList.get(i);
        }
        return arr;
    }
}
