package com.yogi.problemstatement;


//Maximum Absolute Difference

//You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
//        f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
//

public class MaximumAbsoluteDifference {

    public static void main(String[] args) {
        MaximumAbsoluteDifference diff = new MaximumAbsoluteDifference();
        int array []= new int[] {1, 3, -1};
        diff.maxArr(array);

        diff.maxDistance(array);
    }

    private int maxArr(int[] array) {
        int result =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int diff = Math.abs(array[i] - array[j]) + Math.abs(i - j);
                result = Math.max((result), diff);
            }
        }
        return result;
    }

    public    int maxDistance(int[] array)
    {
        // max and min variables as described
        // in algorithm.
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)
        {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, array[i] + i);
            min1 = Math.min(min1, array[i] + i);
            max2 = Math.max(max2, array[i] - i);
            min2 = Math.min(min2, array[i] - i);
        }

        // Calculating maximum absolute difference.
        return Math.max(max1 - min1, max2 - min2);

    }

}
