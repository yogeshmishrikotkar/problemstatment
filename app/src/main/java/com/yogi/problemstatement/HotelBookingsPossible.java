package com.yogi.problemstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;


//
//A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K rooms. Bookings contain an arrival date and a departure date. He wants to find out whether there are enough rooms in the hotel to satisfy the demand. Write a program that solves this problem in time O(N log N) .
//
//        Input:
//
//
//        First list for arrival time of booking.
//        Second list for departure time of booking.
//        Third is K which denotes count of rooms.
//
//        Output:
//
//        A boolean which tells whether its possible to make a booking.
//        Return 0/1 for C programs.
//        O -> No there are not enough rooms for N booking.
//        1 -> Yes there are enough rooms for N booking.
//        Example :
//
//        Input :
//        Arrivals :   [1 3 5]
//        Departures : [2 6 8]
//        K : 1
//
//        Return : False / 0
//
//        At day = 5, there are 2 guests in the hotel. But I have only one room.

public class HotelBookingsPossible {


    public static void main(String[] args) {
        HotelBookingsPossible bookingsPossible = new HotelBookingsPossible();

        ArrayList<Integer> arrival = new ArrayList<>();
        arrival.add(1);
        arrival.add(3);
        arrival.add(5);


        ArrayList<Integer> depart = new ArrayList<>();
        depart.add(2);
        depart.add(4);
        depart.add(6);

        boolean bookingPossible = bookingsPossible.hotel(arrival, depart, 1);
        System.out.println(" is possible "+bookingPossible);
    }

    private boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        boolean isBookingAllowed=false;

        if(arrive==null || depart==null || arrive.isEmpty() || depart.isEmpty()){

            return isBookingAllowed;
        }

        Collections.sort(arrive);
        Collections.sort(depart);


        for (int i = 0; i < arrive.size(); i++) {

            System.out.println(" >>>>>>> "+arrive.get(i));
        }



        int aindex=0;
        int dindex=0;
        int totalRooms=0;
        int max=0;

            while (aindex<arrive.size() && dindex<arrive.size() ){

                Integer arrivalVal = arrive.get(aindex);
                Integer depVal = depart.get(dindex);
                    if(arrivalVal<depVal)
                    {
                        aindex++;
                        totalRooms++;
                        max= Math.max(max,totalRooms);
                    }else{
                        dindex++;
                        totalRooms--;
                    }

            }

            if(max<=K){
                isBookingAllowed= true;
            }
        return isBookingAllowed;
    }


}
