package chapter4_Arrays;

import java.util.Arrays;

public class MethodArraysClass {
    public static void main(String[] args) {
int [] arr = new int[]{1,2,3,4,5,6,7};


//toString()____________________________________________________
        System.out.println(Arrays.toString(arr));

//copyOf()____________________________________________________
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(array));

        int[] newArray = Arrays.copyOf(array, 8);
        System.out.println(Arrays.toString(newArray));
//equals()____________________________________________________
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2);//false => comparing references to arrays
        System.out.println(Arrays.equals(arr1, arr2));// true=>comparing arrays
        System.out.println(Arrays.equals(arr1, arr3));//false=>comparing arrays

//sort()____________________________________________________
        int intArr[] = {55, 57, 61, 66, 18, 19, 27, 38,10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));
        //[10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95]
//binarySearch()____________________________________________
        int intArr1[] = {10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95};
        int searchVal = 55;
        int retVal = Arrays.binarySearch(intArr1, searchVal);
        System.out.println("The index of element 55 is : " + retVal);

////fill()____________________________________________
        int[] array1 = new int[7];
        Arrays.fill(array1, -1);
        System.out.println(Arrays.toString(array1));

//deepToString()____________________________________________
        int [][] array3 = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepToString(array3));

////deepEquals()____________________________________________
        int[][] array4 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(array4, anotherArray));
        System.out.println(Arrays.deepEquals(array4, anotherArray));



    }
}
