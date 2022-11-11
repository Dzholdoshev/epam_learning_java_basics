package chapter4_Arrays;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        //An array of arrays with a dimension of five elements is created.
        int[][] multiplicationTable = new int[5][];
        System.out.println("multiplicationTable = " + multiplicationTable );
        //The array is displayed to the standard output.
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        //One-dimensional arrays are created, references to which are stored in the first array.
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        //A two-dimensional array is displayed in the console (for a better understanding of the mechanism for creating a two-dimensional array).
        System.out.println("\nInitialization array");

        int counter = 0;
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                counter++;
                multiplicationTable[i][j]=counter;
                System.out.print(" " + multiplicationTable[i][j]);
            }
            System.out.println();
        }

        int[][] arr = new int[3][3];
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(multiplicationTable[1]));
        System.out.println(multiplicationTable[1][1]=9);
    }



}
