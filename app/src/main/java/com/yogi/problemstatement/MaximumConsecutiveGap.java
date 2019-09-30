package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumConsecutiveGap {


    public static void main(String[] args) {

        MaximumConsecutiveGap maximumConsecutiveGap = new MaximumConsecutiveGap();
        int arr[]=new int[]{1/*,10,5*/};
        maximumConsecutiveGap.getGapValue(arr);
    }

    private void getGapValue(int[] arr) {

        Arrays.sort(arr);

        int diff=-1;

        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(" >>> "+(arr[i+1]-arr[i]));
            if(diff<(arr[i+1]-arr[i])){

                diff=(arr[i+1]-arr[i]);
            }
        }

        System.out.println(" >>>> "+diff);
    }

}
