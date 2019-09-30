package com.yogi.problemstatement;

import java.util.Arrays;

public class NobleInteger {

    public static void main(String[] args) {


        NobleInteger nobleInteger = new NobleInteger();
        int [] arr = {/*10, 3, 20, 40, 2*/
                /*5,6,2*/
                -4, -2, 0, -1, -6
        };

        int nobalInt = nobleInteger.findNobalInt(arr);

        System.out.println(" >>>>>>>>> "+nobalInt);

    }

    private int findNobalInt(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {

            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i] == n-i-1){

                return  1;
            }
        }
        if (arr[n-1] == 0)
            return 1;

        return -1;
    }
}
