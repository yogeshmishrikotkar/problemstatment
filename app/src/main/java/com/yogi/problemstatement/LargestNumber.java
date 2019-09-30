package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//
//
//Given a list of non negative integers, arrange them such that they form the largest number.
//
//        For example:
//
//        Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
//
//        Note: The result may be very large, so you need to return a string instead of an integer.

public class LargestNumber {


    public static void main(String[] args) {

        LargestNumber largestNumber = new LargestNumber();

        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(34);
        list.add(5);
        list.add(9);

//        list.add(0);
//        list.add(0);
//        list.add(0);
//        list.add(0);




        largestNumber.createLargeNumber(list);
    }

    private String createLargeNumber(ArrayList<Integer> list) {
        if(list==null || list.isEmpty()){
            return "";
        }

        ArrayList<String> strList=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            strList.add(""+list.get(i));
        }

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String one = a+b;
                String two = b+a;
                return one.compareTo(two);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        int result=0;
        for (int i = strList.size()-1; i >=0; i--) {

            stringBuilder.append(strList.get(i));
            result+=Integer.parseInt(strList.get(i));
        }
        System.out.println(">>>>>. "+stringBuilder.toString());

         return result>0?"0":stringBuilder.toString();
    }


    private String createLargeNumber(List<Integer> list) {
        if(list==null || list.isEmpty()){
            return "";
        }

        ArrayList<String> copy=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            copy.add(""+list.get(i));
        }




        Collections.sort(copy, new Comparator<String>(){

            @Override
            public int compare(String X, String Y) {

                String XY = X + Y;
                String YX = Y + X;

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder("");

        for (String s : copy) {
            sb.append(s);
        }

        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
}
