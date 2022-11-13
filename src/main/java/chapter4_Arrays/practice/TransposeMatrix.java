package chapter4_Arrays.practice;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int [][] res = new int[matrix[0].length][matrix.length];
        //Put your code here

        if (matrix.length > 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    res[i][j] = matrix[j][i];
                }
                System.out.print("\n");
            }
        }

        return res;
    }

        public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = { {-24853, -643535, 5687654}, {7248, 4213, 32} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
