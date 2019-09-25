package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class MergePverlappingInterval {
    public static void main(String[] args) {
        MergePverlappingInterval interval = new MergePverlappingInterval();

        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1, 3));

        intervals.add(new Interval(2, 9));
        intervals.add(new Interval(3, 8));

        intervals.add(new Interval(4, 7));

        intervals.add(new Interval(5, 6));

        intervals.add(new Interval(6, 6));
        interval.mergeOverlapping(intervals);
    }

    private ArrayList<Interval> mergeOverlapping(ArrayList<Interval> intervals) {


        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {

                return o1.start - o2.start;
            }
        });


        Stack<Interval> stack = new Stack<>();
        stack.push(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval top = stack.peek();
            Interval current = intervals.get(i);
            if (top.end < current.start) {
                stack.push(current);
            } else  if (top.end < current.end)
            {
                top.end = current.end;
                stack.pop();
                stack.push(top);
            }
        }


        ArrayList<Interval> l1 = new ArrayList<>();
        l1.addAll(stack);
        return l1;
    }

}
