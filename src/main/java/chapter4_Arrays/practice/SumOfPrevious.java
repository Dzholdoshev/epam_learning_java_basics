package chapter4_Arrays.practice;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here

        int sum=0;
        boolean[] resultArr = new boolean[array.length];
        resultArr[0]= false;
        resultArr[1]=false;

        for (int i = 2; i < array.length; i++) {
            if(array[i]==(array[i-2]+array[i-1])){
                resultArr[i]=true;
            }else{resultArr[i]=false;}

        }
        return resultArr;
    }
}
