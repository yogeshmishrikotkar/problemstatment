package com.yogi.problemstatement;


//Given an array of integers, sort the array into a wave like array and return it,
//        In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
//
//        Example
//
//        Given [1, 2, 3, 4]
//
//        One possible answer : [2, 1, 4, 3]
//        Another possible answer : [4, 1, 3, 2]


import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        WaveArray waveArray= new WaveArray();
        waveArray.createWaveArray(new int[]{ 2,1,4,3});
    }

    private int[] createWaveArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length-1  ; i+=2) {
             swap(array,i,i+1);
        }
        return array;
    }

    private void swap(int[] array, int i, int i1) {
        int temp=array[i];
        int next=array[i1];
        array[i]=next;
        array[i1]=temp;
    }

}
