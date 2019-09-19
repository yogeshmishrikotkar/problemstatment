package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UmbrellaProble {

//    const solve = (people, umbrellas) => {
//    const biggerUmbrella = Math.max(...umbrellas)
//    const remain = people % biggerUmbrella
//    const peopleThatFit = Math.floor(people / biggerUmbrella)
//
//        if (remain >= 1 && umbrellas.length === 1) {
//            return -1
//        } else {
//        const remainingUmbrellas = umbrellas.filter(umbrella => umbrella !== biggerUmbrella)
//            return remain !== 0 ? solve(remain, remainingUmbrellas) + peopleThatFit : peopleThatFit
//        }
//    }

    public int  solve (int people, List<Integer> list ){

        Integer biggerUmbrella = Collections.max(list);

        int remain=people%biggerUmbrella;

        int peopleThatFit = (int) Math.floor(people / biggerUmbrella);

        if (remain >= 1 && list.size() == 1) {
            return -1;
        }else{
        List<Integer > remainingUmbrellas = new ArrayList<>();

            for (Integer umbrella: list
                 ) {
                if(umbrella!=biggerUmbrella){
                    remainingUmbrellas.add(umbrella);
                }
            }

           return remain != 0 ? solve(remain, remainingUmbrellas) + peopleThatFit : peopleThatFit;
        }
    }


    public int lastStoneWeight(List<Integer> stones) {


        // Write your code here
        if (stones == null) {
            return 0;
        }
        //Collections.sort(stones);
        PriorityQueue pq = new PriorityQueue ();
        for (int i = 0; i < stones.size(); i++) {
            pq.offer(stones.get(i));
        }
        while (pq.size() > 1) {
            Integer first =(Integer) pq.poll();
            Integer second =(Integer) pq.poll();
            if (first != second) {
                int rem = Math.abs(first - second);
                pq.offer(rem);
            }
        }
        return pq.size() == 1 ? (Integer)pq.poll() : 0;
    }
}
