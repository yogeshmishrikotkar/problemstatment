package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.List;

public class MinStepsForInfinateGrid {


//    Input: points[] = [(0, 0), (1, 1), (1, 2)]
//    Output: 2 /
//    Move from (0, 0) to (1, 1) in 1 step(diagonal) and
//    then from (1, 1) to (1, 2) in 1 step (rightwards)
//
//    Input: points[] = [{4, 6}, {1, 2}, {4, 5}, {10, 12}]
//    Output: 14
//    Move from (4, 6) -> (3, 5) -> (2, 4) -> (1, 3) ->
//            (1, 2) -> (2, 3) -> (3, 4) ->
//            (4, 5) -> (5, 6) -> (6, 7) ->
//            (7, 8) -> (8, 9) -> (9, 10) -> (10, 11) -> (10, 12)

    //logic behind this
    //treat this (0, 0) as one point
    //x1-x2 , y1-y2
    // max of (x,y,) and add in count

    public static void main(String[] args) {
        MinStepsForInfinateGrid steps = new MinStepsForInfinateGrid();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(1);
        l1.add(4);
        l1.add(10);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(6);
        l2.add(2);
        l2.add(5);
        l2.add(12);


        steps.convert(l1,l2);


    }

    private int convert(List<Integer> l1, List<Integer> l2) {

        List<Point> points = convertPoint(l1, l2);


        int count =0;
        for (int i = 0; i < points.size()-1; i++) {


            Point p1 = points.get(i);
            Point p2 = points.get(i+1);
            int dx = Math.abs(p1.x - p2.x);
            int dy = Math.abs(p1.y - p2.y);

            int max = Math.max(dx, dy);
           // System.out.println("count "+max);
            count += Math.max((dx), dy);

        }

        return count ;
    }

    private List<Point> convertPoint(List<Integer> p1, List<Integer> p2) {

        ArrayList<Point> points=new ArrayList<>();
        for (int i = 0; i < p1.size(); i++) {

            points.add(new Point(p1.get(i),p2.get(i)) );
        }

        return points;
    }


    class Point{

        int x ;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int y ;



    }
}
