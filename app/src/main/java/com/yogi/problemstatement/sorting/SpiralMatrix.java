package com.yogi.problemstatement.sorting;


public class SpiralMatrix {

    private static int LEFT_TO_RIGHT=0;
    private static int TOP_BOTTOM=1;

    private static int RIGHT_TO_LEFT=2;

    private static int BOTTOM_TO_TOP =3;


    public int[] spiralOrder(final int[][] A/*, int rows, int column*/) {
        int rows =A.length-1;
        int coulum =A[0].length-1;



        int[] result_array= new int [(A.length)*(A[0].length)];
        int top=0;//start row index
        int bottom=rows; //endging row index

        int left=0;//start column index
        int right=coulum;//ending column idex

        int dir=0;

        int index=0;
        while (top<=bottom && left<=right ){
            if(dir==LEFT_TO_RIGHT){
                for (int i = left; i <=right; i++) {

                     result_array[index++]=A[top][i];
                     //System.out.print(" "+A[top][i]);
                }
                dir=1;
                top=top+1;
                //System.out.println (" ");

            }else if(dir==TOP_BOTTOM){
                for (int i = top; i <=bottom; i++) {
                    result_array[index++]=A[i][right];
                    //  System.out.print(" "+A[i][right]);
                }
                dir=2;
                right=right-1;
                System.out.println (" ");
            }else if(dir==RIGHT_TO_LEFT){
                for (int i = right; i >=left; i--) {
                     result_array[index++]=A[bottom][i];
                    // System.out.print(" "+A[bottom][i]);
                }
                bottom=bottom-1;

                dir=3;
                System.out.println (" ");
            }else if(dir== BOTTOM_TO_TOP){
                for (int i = bottom; i>=top; i--) {
                     result_array[index++]=A[i][left];
                    // System.out.print(" "+A[i][left]);
                }

                left=left+1;
                dir=0;
                //System.out.println (" ");
            }
        }

        return result_array;
    }

    public static void main(String[] args) {
        int m =3;
        int n = 4;
        SpiralMatrix matrix = new SpiralMatrix();
//        int a[ ][ ] = new int[][]{{1, 2, 3, 4},
//                {5,6,7,8},
//                {9,10,11,12}};

        int a[ ][ ] = new int[][]{{1, 2 },
                 { 3, 4}, {5,6}};

//                int a[ ][ ] = new int[][]{{335, 401, 128, 384, 345, 275, 324, 139, 127, 343, 197, 177, 127, 72, 13, 59},
//                {102, 75, 151, 22, 291, 249, 380, 151, 85, 217, 246, 241, 204, 197, 227, 96},
//                {261, 163, 109, 372, 238, 98, 273, 20, 233, 138, 40, 246, 163, 191, 109, 237},
//                        {179, 213, 214, 9, 309, 210, 319, 68, 400, 198, 323, 135, 14, 141, 15, 168},};
       // int a[ ][ ] = new int[][]{{1}};

        int[] result_array = matrix.spiralOrder(a);

        System.out.println(" result_array.length "+result_array.length);
        for (int i = 0; i < result_array.length; i++) {
         System.out.print("  "+result_array[i]);
        }


    }
}
