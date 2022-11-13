package chapter4_Arrays.practice;

import chapter4_Arrays.Arr;

import java.util.Arrays;
import java.util.NoSuchElementException;

class CycleSwap {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(new int[]{9, 1, 2, 3, 4, 5, 5, 6, 7, 8}, array));
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.equals(new int[]{8, 9, 1, 2, 3, 4, 5, 5, 6, 7}, array));
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.equals(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 5, 6}, array));






    }

    static int[] cycleSwap(int[] array) {

        if (array.length != 0) {
            int[] result = new int[array.length];
            result[0] = array[array.length - 1];
            System.arraycopy(array, 0, result, 1, array.length - 1);
            System.arraycopy(result, 0, array, 0, array.length );
            System.out.println("Result:"+Arrays.toString(array));
        }else {array = new int[]{};}

        return array;
    }

    static int[] cycleSwap(int[] array, int shift) {

        if (array.length != 0) {
            int[] result = new int[array.length];
          System.arraycopy(array, 0, result, shift, array.length - shift);
          System.arraycopy(array, array.length - shift, result, 0, shift);
          System.arraycopy(result, 0, array, 0, array.length );

        }else {array = new int[]{};}
        return array;
    }
}