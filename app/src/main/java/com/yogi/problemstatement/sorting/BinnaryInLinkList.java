package com.yogi.problemstatement.sorting;

import java.util.Collections;

public class BinnaryInLinkList {


    public static long getNumber(SinglyLinkedListNode node) {
        long decimal=0;
        if(node==null){

            return -1;
        }

        while (node.next!=null){
            int value =node.data;
            if(value==0 || value==1 ){
                decimal= (decimal * 2)+node.data;
            }else{
                decimal=-1;
                break;
            }
        }
        return decimal;
    }

   class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
}
