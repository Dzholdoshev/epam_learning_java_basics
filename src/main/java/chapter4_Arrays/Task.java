package chapter4_Arrays;

public class Task {
    public static void main(String[] args) {

        /*
        The solution is as follows:
First, you need to iterate through the array and find the maximum value.
Since you do not change the array in this case, it is better to use the for-each.
Next, you need to change the elements in the array.
It is correct to use the ordinary for loop since you need to access the array elements by index.
         */
        int[] array = { 5, 10, 0, -5, 16, -2 };
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
            System.out.println("array[" + i + "]= "+ array[i]);
        }
    }
}
