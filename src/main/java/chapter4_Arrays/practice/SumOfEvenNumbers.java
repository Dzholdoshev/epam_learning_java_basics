package chapter4_Arrays.practice;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
       //  int[] array = new int[]{1, -2, 2, 8, 15, -160, 199};
        int[] array = new int[]{};
        System.out.println(sum(array));


    }

    public static int sum(int[] array) {

        //put your code here

        int sum = 0;
        if (array == null ) { sum=0;}
        else{
            for (int element : array) {
                if (element % 2 == 0) {
                    sum += element;
                }
            }}
        return sum;
        }

}