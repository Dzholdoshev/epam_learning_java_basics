package chapter4_Arrays.practice;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int [][] result = new int[matrix1.length][matrix2[0].length];
        // Put your code here
        for (int i=0; i< result.length; ++i)
            for (int j=0; j< result[0].length; ++j)
                for (int k=0; k< matrix2.length; ++k)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

        return result;



    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = { {0, 12345}, {4509, 0}, {3, 567} };
        int[][] b = { {653, 0, 25353}, {0, 61, 6} };
        int[][] expected = {{0, 753045, 74070}, {2944377, 0, 114316677}, {1959, 34587, 79461}};

        int[][] actual = MultiplyMatrix.multiply(a, b);
        System.out.println(Arrays.deepEquals(expected, actual));

    }
}
