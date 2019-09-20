package com.yogi.problemstatement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        RepeatAndMissingNumber missingNumber = new RepeatAndMissingNumber();
//        int  arr[] =new int[]  {3,  3};
        int[] arr={ 4, 3, 6, 2, 1, 1 };
        missingNumber.findMissingAndRepete1(arr);

    }

    private void findMissingAndRepete(int[] arr) {

        int n=arr.length;
        int missing=0;
        // Sum of first n natural numbers
        int sumN = (n * (n + 1)) / 2;

        // Sum of squares of first n natural numbers
        int sumSqN = (n * (n + 1) * (2 * n + 1)) / 6;

        // To store the sum and sum of squares
        // of the array elements
        int sum = 0, sumSq = 0, i;

        for (i = 0; i < n; i++) {
            sum += arr[i];
            sumSq += Math.pow(arr[i], 2);
        }

        int B = (((sumSq - sumSqN) / (sum - sumN)) + sumN - sum) / 2;
        int A = sum - sumN + B;
        if(B==0){
            B=1;
        }
        System.out.println("A = " + A + "\nB = " + B);


    }

    private void findMissingAndRepete1(int[] arr) {

        int repeting=0;
        int missing=0;
        Map<Integer, Boolean> numberMap
                = new HashMap<>();

        int max = arr.length;

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                repeting=i;
//                System.out.println("Repeating = " + i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                missing=i;
                break;
            }
        }

        System.out.println(" >>>>> "+missing+" >>> "+repeting);



    }
}
