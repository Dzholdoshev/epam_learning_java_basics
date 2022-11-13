package chapter4_Arrays.practice;

public class Test {
    public static void main(String[] args) {


        int[][] arr = new int[3][3];

        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++, counter++) {
                arr[j][i] = counter;
                System.out.print(String.format("%4s", arr[i][j]));
            }

        }
    }
}
