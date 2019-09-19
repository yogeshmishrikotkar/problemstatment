package com.yogi.problemstatement;


//Find the contiguous subarray within an array,
// A of length N which has the largest sum.

public class MaxSumOfSubArray {




    public static void main(String[] args) {
        MaxSumOfSubArray sumOfSubArray= new MaxSumOfSubArray();
        int array[]=new int[]  {1, 2, 3, 4, -10};
        sumOfSubArray.maxSubArray(array);
    }


    //this is based on kudane algo
    private int maxSubArray(int[] array) {

        int start=0; int end=0;
         int s=0;

         int maxSoFar=array[0];
         int maxEndHere=0;
         int size=array.length;

        for (int i = 0; i < size; i++) {
            maxEndHere=maxEndHere+array[i];
            if(maxSoFar< maxEndHere){
                maxSoFar=maxEndHere;
                start=s;
                end=i;
            }
            if(maxEndHere<0){
                maxEndHere=0;
                s=i+1;
            }
        }

//        int sum=0;
//        for (int i =start;i<=end;i++){
//            //sum+=array[start];
//            System.out.println(" "+array[i]);
//        }
//        System.out.println("sum is "+sum+" start "+start+" end "+end+"  maxSoFar  "+maxSoFar);

        return maxSoFar;

    }
}
