package com.yogi.problemstatement;
//
//Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//        Example:
//
//        Given the following matrix:
//
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//
//        You should return
//
//        [1, 2, 3, 6, 9, 8, 7, 4, 5]
//

public class SpiralOrder2Matrix {

    private static int LEFT_TO_RIGHT=0;
    private static int TOP_BOTTOM=1;

    private static int RIGHT_TO_LEFT=2;

    private static int BOTTOM_TO_TOP =3;


    public int[][] spiralOrder(int A/*final int[][] A*//*, int rows, int column*/) {
        int rows =A;
        int coulum =A;

        int[][] result_array= new int [rows][coulum];
        int top=0;//start row index
        int bottom=rows-1; //endging row index

        int left=0;//start column index
        int right=coulum-1;//ending column idex

        int dir=0;

        int index=0;
        int count=1;
        while (top<=bottom && left<=right ){
            if(dir==LEFT_TO_RIGHT){
                for (int i = left; i <=right; i++) {
                    result_array[top][i]=count++;
                }
                dir=1;
                top=top+1;
            }else if(dir==TOP_BOTTOM){
                for (int i = top; i <=bottom; i++) {
                    result_array[i][right]=count++;
                }
                dir=2;
                right=right-1;
               // System.out.println (" ");
            }else if(dir==RIGHT_TO_LEFT){
                for (int i = right; i >=left; i--) {
                    // result_array[index++]=A[bottom][i];

                    result_array[bottom][i]=count++;
                }
                bottom=bottom-1;

                dir=3;
                System.out.println (" ");
            }else if(dir== BOTTOM_TO_TOP){
                for (int i = bottom; i>=top; i--) {
                    // result_array[index++]=A[i][left];
                    result_array[i][left]=count++;
                }

                left=left+1;
                dir=0;
            }
        }

        return result_array;
    }

    public static void main(String[] args) {
        int m =3;
        int n = 4;
        SpiralOrder2Matrix matrix = new SpiralOrder2Matrix();
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

        int[][] result_array = matrix.spiralOrder(4);

        System.out.println(" result_array.length " + result_array.length);
        for (int i = 0; i < result_array.length; i++) {
            System.out.println("  " );
            for (int j = 0; j < result_array.length; j++) {
                System.out.print("  " + result_array[i][j]);
            }
        }


    }
}
