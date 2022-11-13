package chapter4_Arrays.practice;

import java.util.Arrays;

class Spiral {
    public static void main(String[] args) {


        int[][] expected = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {18, 19, 20, 21, 22, 7},
                {17, 28, 29, 30, 23, 8},
                {16, 27, 26, 25, 24, 9},
                {15, 14, 13, 12, 11, 10}

        };
        System.out.println( Arrays.deepToString(spiral(10,10)));
        System.out.println( Arrays.deepEquals(expected, Spiral.spiral(5, 6)));
int[][] array = spiral(8,7);


        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%3s", array[i][j]));
            }

        }



    }

    static int[][] spiral(int rows, int columns) {

        int[][] array = new int[rows][columns];
        int i, k = 0, l = 0;
        int counter=1;
        /*  k - starting row index
        row - ending row index
        l - starting column index
        column - ending column index
        i - iterator
        */


        while (k < rows && l < columns) {

            // Print the first row from the remaining rows
            for (i = l; i < columns; ++i, counter++) {
                array[k][i] = counter;

            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < rows; ++i,counter++) {
                array[i][columns - 1]=counter;

            }
            columns--;

            // Print the last row from the remaining rows */
            if (k < rows)  {
                for (i = columns - 1; i >= l; --i,counter++) {
                    array[rows - 1][i] = counter;

                }
                rows--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < columns) {
                for (i = rows- 1; i >= k; --i,counter++) {
                    array[i][l] =counter;

                }
                l++;
            }
        }
      //  System.out.println(Arrays.deepToString(array));
        return array;
    }




}