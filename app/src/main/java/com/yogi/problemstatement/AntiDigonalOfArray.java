package com.yogi.problemstatement;

/*
Anti Diagonals
        Asked in:
        Microsoft
        Adobe
        Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

        Example:


        Input:

        1 2 3
        4 5 6
        7 8 9

        Return the following :

        [
        [1],
        [2, 4],
        [3, 5, 7],
        [6, 8],
        [9]
        ]


        Input :
        1 2
        3 4

        Return the following  :

        [
        [1],
        [2, 3],
        [4]
        ]
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AntiDigonalOfArray {


    public static void main(String[] args) {
        AntiDigonalOfArray antiDigonalOfArray = new AntiDigonalOfArray();


        antiDigonalOfArray.getAntiDigonalList();

    }


    private List<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> list) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                ArrayList<Integer> arrayList=null;
                int key =i+j;
                if(map.containsKey(key)){
                    arrayList = map.get(key);
                }else{
                    arrayList= new ArrayList<>();
                    map.put(key,arrayList);
                }
                arrayList.add(list.get(i).get(j));
            }
        }

        Set<Integer> integers = map.keySet();
        List<ArrayList<Integer>> result= new ArrayList<>();
        for (Integer value : integers) {
            result.add(map.get(value));;
        }

        return result;
    }

    private void getAntiDigonalList() {

        int row = 3;
        int column = 5;
        int array[][] = new int[row][column];
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = count++;
            }
        }

        int length = array.length;


        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int key =i+j;
                ArrayList<Integer> arrayList=null;
                if(map.containsKey(key)){
                    arrayList = map.get(key);
                }else{
                    arrayList= new ArrayList<>();
                    map.put(key,arrayList);
                }
                arrayList.add(array[i][j]);
            }
        }

        Set<Integer> integers = map.keySet();


        List<ArrayList<Integer>> result= new ArrayList<>();
        for (Integer value : integers) {

            result.add(map.get(value));;
        }

       // System.out.println(array);
    }


}
