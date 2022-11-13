package chapter4_Arrays.practice;

import chapter4_Arrays.Arr;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array;
        int[] expected;
        int[] actual;
        array = new int[]{-3, 2, 4, 3, 5, 12, 8};
        expected = new int[]{-3, 2, 3, 5, 8};
        actual = LocalMaximaRemove.removeLocalMaxima(array);

     boolean res1 =  Arrays.equals(new int[]{-3, 2, 4, 3, 5, 12, 8}, array);
     boolean res2 =  Arrays.equals(expected, actual);

        System.out.println(res1);
        System.out.println(res2);

        System.out.println(Arrays.toString(actual));



    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here

        int[] result = new int[array.length];  //create new array to input result
        int j = 0;

        for (int i = 0; i < array.length; i++) { // iteration through the all array
            if ((i > 0 && array[i] <= array[i - 1]) // condition if index != 0 && element <= previous element
                    // OR  index!= penultimate index && element <= next element
                    || (i != array.length - 1 && array[i] <= array[i + 1])){
                result[j++] = array[i]; // initialization of result array
            }
        }
        return Arrays.copyOf(result, j);
    }
}
