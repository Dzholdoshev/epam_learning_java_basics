package chapter4_Arrays;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {

        //Declaring an Array:
        int[] arr1;   //1st method
        int arr2 [];  //2nd method

        //Allocating memory for the array
         int[] arr3 = new int[5];


         //Initializing the array
      // 1)First method
       int[] arr4 = new int[3];
        arr4[0] = 10;
        arr4[1] = 20;
        arr4[2] = 30;
        // 1)Second method
        int[] numberArray = new int[10];
        int i = 0;
        while (i < 10) {
            numberArray[i] = i;
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println((i+1) + "th array element = " + numberArray[i]);
            i++;
        }

        //
        //<data type>[] <identifier> = {<literal expression>, ...};
        int[] сolor = {255, 126, 255};



        //Anonymous Array
        int[] daysInMonth;
       // daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; doesn't work
        daysInMonth = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };







    }
}
