package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/*

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

        If there is no solution possible, return -1.

        Example :

        A : [3 5 4 2]

        Output : 2
        for the pair (3, 4)

*/

public class MaxDistance {


    public static void main(String[] args) {
        MaxDistance maxDistance = new MaxDistance();
        int arr[] = { 3, 2, 1
              };

        maxDistance.maximumGap(arr);
    }

    private int maximumGap(int[] arr) {

        List<IndexValuePair> indexValuePairs =new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            indexValuePairs.add(new IndexValuePair(arr[i],i));
        }

        Collections.sort(indexValuePairs);

        int size= indexValuePairs.size();

        int[] rightMax = new int[size];
        int maxValue = Integer.MIN_VALUE;

        // Store the max value from the right to the left
        for (int i = size - 1; i >= 0; i--) {
            maxValue = Math.max(maxValue, indexValuePairs.get(i).index);
            rightMax[i] = maxValue;
        }


        int maxDiff = Integer.MIN_VALUE;
        // Iterate over helper and check the diff value
        for (int i = 0; i < size; i++) {
            maxDiff = Math.max(maxDiff, rightMax[i] - indexValuePairs.get(i).index);
        }
//        System.out.println(" >>>>>>>>>>> "+maxDiff);
        return maxDiff;
    }



    public class IndexValuePair implements Comparable<IndexValuePair> {
        public int value;
        public int index;

        public IndexValuePair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(IndexValuePair indexValuePair) {
            // Comparison on the value

            if (value < indexValuePair.value) {
                return -1;
            } else if (value == indexValuePair.value) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
