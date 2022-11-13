package chapter4_Arrays.practice;

public class MaxMethod {
    public static void main(String[] args) {
        int[] array = new int[] {2,3,23,1,2,6,3,13,6};

        System.out.println(max(array));

    }

    public static int max(int[] values) {

        int maxValue = -2147483648;
        for (int element:values) {
            if(element>maxValue){
                maxValue=element;
            }
        }
        return maxValue;

    }
}