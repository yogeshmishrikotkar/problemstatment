package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeInterval {



    public static void main(String[] args) {

        MergeInterval  interval = new MergeInterval();

        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1,2));

        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
//        intervals.add(new Interval(1,9));
//        intervals.add(new Interval(2,4));
//        intervals.add(new Interval(4,7));

        interval.insert(intervals, new Interval(15,18));
    }

    private ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval i1) {


        if(intervals.isEmpty()){
            return new ArrayList<Interval>();
        }


        intervals.add(i1);

        Collections.sort(intervals,new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start > o2.start) {
                    return 1;
                } else if (o1.start < o2.start) {
                    return -1;
                }
                return 0;
            }
        });

        ArrayList<Interval> list = new ArrayList();
        list.add(intervals.get(0));
        for(int i=1; i < intervals.size(); i++) {
            Interval prev = list.get(list.size() - 1);
            Interval curr = intervals.get(i);
            if (curr.start <= prev.end) {
                prev.start = Math.min(prev.start, curr.start);
                prev.end = Math.max(prev.end, curr.end);
            } else {
                list.add(curr);
            }
        }
        return list;
    }


}

  class Interval{
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
