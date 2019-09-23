package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.List;

public class MaxNonNegativeInteger {

    public static void main(String[] args) {
        MaxNonNegativeInteger negativeInteger = new MaxNonNegativeInteger();
        int []array=new int[]{/*1, 2, 5, -7, 2, 5*//* -846930886, -1714636915, 424238335, -1649760492*/ /*-1, -1, -1, -1, -1*//*-846930886, -1714636915, 424238335, -1649760492*//*336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421*/
//                0, 0, -1, 0
                0, 0, -1, 0 /*1967513926, 1540383426, -1303455736, -521595368*/};

        int[] maxNonNegativeSubArry = negativeInteger.getMaxNonNegativeSubArry(array);

        negativeInteger.print(maxNonNegativeSubArry);
    }

    private void print(int[] maxNonNegativeSubArry) {
        for (int i = 0; i < maxNonNegativeSubArry.length; i++) {
            System.out.println(" "+maxNonNegativeSubArry[i]);
        }
    }

    private int[] getMaxNonNegativeSubArry(int[] array) {

        int n= array.length;
        int curLeft =0;
        long cSum=0;
        long maxsum=0;
        int maxLeft=-1;
        int maxRight=-1;
        for (int curRight = 0; curRight < n; curRight++) {
            if(array[curRight]<0){
                cSum=0;
                curLeft=curRight+1;
            }else {
                int temp =array[curRight];
                //System.out.println(" >>> "+temp);
                cSum=cSum+array[curRight];
                //System.out.println(" >>>cSum  "+cSum);
                boolean b = (cSum == maxsum &&
                        curRight - curLeft + 1 > maxRight - maxLeft + 1);
                if(cSum>maxsum ||  b){
                    maxsum=cSum;
                    maxLeft=curLeft;
                    maxRight=curRight;
                }
            }

        }


    if(maxLeft==-1){
        return new int[0];
    }else{

        List<Integer> list=new ArrayList<>();

        for (int i = maxLeft; i <=maxRight; i++) {
            list.add(array[i]);
        }

        int a[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i]=list.get(i);
        }
        return a;
    }

    }
}
