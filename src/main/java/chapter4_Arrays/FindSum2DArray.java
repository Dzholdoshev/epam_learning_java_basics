package chapter4_Arrays;

public class FindSum2DArray {
    public static void main(String[] args) {

        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 0, 2, 0, 4, 0 } };

        System.out.println(findSum2D(array2D));

    }

    public static int findSum2D(int [][] arr2D){
        int sum=0;
        for (int[] eachArr:arr2D) {
            for (int element:eachArr) {
                sum+=element;
            }
        }
        return sum;

    }

}
