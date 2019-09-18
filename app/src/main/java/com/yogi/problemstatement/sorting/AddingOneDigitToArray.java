package com.yogi.problemstatement.sorting;

public class AddingOneDigitToArray {


    public static void main(String[] args) {
        AddingOneDigitToArray a1= new AddingOneDigitToArray();

        int array[]=new int[]{0,9,9};
        a1.calculate(array);
    }

    private void calculate(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        int number = Integer.parseInt(stringBuilder.toString())+1;
//       System.out.println(" numuber is "+number);

        int newArray[] =new int[(""+number).length()];


        int index=newArray.length-1;

        while (index>=0){
            int tempNumber =number%10;
            number=number/10;
            newArray[index]=tempNumber;
//              System.out.println(" numuber is array[i] "+newArray[index]+" "+index);
            index=index-1;

        }



    }


}
