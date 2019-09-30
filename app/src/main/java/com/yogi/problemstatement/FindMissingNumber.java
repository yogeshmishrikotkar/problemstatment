package com.yogi.problemstatement;

import java.util.Arrays;
import java.util.HashMap;
/*Given an unsorted integer array, find the first missing positive integer.

        Example:

        Given [1,2,0] return 3,

        [3,4,-1,1] return 2,

        [-8, -7, -6] returns 1

        Your algorithm should run in O(n) time and use constant space.*/
public class FindMissingNumber {

    public static void main(String[] args) {
        FindMissingNumber findMissingNumber = new FindMissingNumber();

        int arr[]=new int[]{1, 1, 0, -1, -2};
        findMissingNumber.findFirstMissingNumberInArray(arr);
    }

    private int findFirstMissingNumberInArray(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        HashMap<Integer, Boolean> map= new HashMap<>();
        if(max<=0){
            max=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                map.put(arr[i],true);
            }
        }
        int number=-1;
        for (int i = 1; i <=(max + 1); i++) {

            if(!map.containsKey(i)){
                number=i;
                break;
            }
        }
        return number;
    }
}
