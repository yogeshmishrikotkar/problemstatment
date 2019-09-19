package com.yogi.problemstatement;

//
//
//Given a non-negative number represented as an array of digits,
//
//        add 1 to the number ( increment the number represented by the digits ).
//
//        The digits are stored such that the most significant digit is at the head of the list.
//
//        Example:
//
//        If the vector has [1, 2, 3]
//
//        the returned vector should be [1, 2, 4]
//
//        as 123 + 1 = 124.
public class AddingOneDigitToArray {


    public static void main(String[] args) {
        AddingOneDigitToArray a1= new AddingOneDigitToArray();
        int array[]=new int[]{0, 3, 7, 6, 4, 0, 5, 5, 5 };
        int[] calculate = a1.plusOne(array);
        for (int i = 0; i < calculate.length; i++) {
            System.out.print(""+calculate[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int array1[]=new int[]{9, 9, 9, 9, 9 };
        int[] calculate1= a1.plusOne(array1);
        for (int i = 0; i < calculate1.length; i++) {
            System.out.print(""+calculate1[i]);
        }
    }




    public int[] plusOne(int[] array)
    {
        int n = array.length;//a.size();

//        int resultArray[]=new int[n+1];
        // Add 1 to last digit and find carry
        array[n - 1]=array[n - 1] + 1;
        int carry = array[n - 1] / 10;
        array[n - 1]= array[n - 1 ]% 10;

        // Traverse from second last digit
        for (int i = n - 2; i >= 0; i--)
        {
            if (carry == 1)
            {
                array[i]=array[i]+1;
                carry =  array[i] / 10;
                array[i]= array[i] % 10;
            }
        }


        if(carry==1){
            int[] resarr = new int[array.length+1];
            resarr[0]=carry;
            for (int i = array.length-1; i >0;i--) {
                resarr[i]=array[i];
            }
            return  resarr;
        }



        // this is improtant logic to remove all leading zero in front

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                break;
            }
            counter++;
        }

        int[] resarr = new int[array.length-counter];

        for (int i = 0; i< array.length-counter; i++) {
            resarr[i]=array[i+counter];
        }



        return resarr;
    }



}
