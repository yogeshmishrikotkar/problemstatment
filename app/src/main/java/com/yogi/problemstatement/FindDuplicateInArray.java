package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateInArray {


    public static void main(String[] args) {
        FindDuplicateInArray findDuplicateInArray=new FindDuplicateInArray();

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);


        findDuplicateInArray.repeatedNumber(list);
    }

    private int repeatedNumber(List<Integer> list) {
        HashMap<Integer,Boolean> map = new HashMap();

        Collections.sort(list);
        int value =-1;

        for (int i = 0; i < list.size(); i++) {

            if(map.containsKey(list.get(i))){
                value=list.get(i);
                break;
            }else{
                map.put(list.get(i),false);
            }
        }

//        System.out.println(" >>>>>> "+value);
        return value;


    }
}
