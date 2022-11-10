package chapter2_Data_types.operators;

public class Check {
    public static void main(String[] args) {

        System.out.println(12345 + 5432l);
        //17777 correct Answer
        // Correct:The '+' operator performs addition notwithstanding the types of operands.
        // Therefore, simple addition will be done.

        System.out.println("2 + 2 = " + 2 + 2);
        //2 + 2 = 22
        //Correct:The first operand is a string.
        // A string will be the result of the entire operation.
        // No arithmetic addition actions will be performed.

        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10);
        System.out.println(a > 20 || b > 10);  //true
        System.out.println(! (b > 10));
        System.out.println(! (a > 20));        //true

        // Correct:a > 20 || b > 10 –- the result is "true", if at least one operand is "true".
        // ! (a > 20) –- the result is "true", since the negation of the result is "false".

        String s = "Hello";
        long l = 99;
        double d = 1.11;
        int i = 1;
        int j = 0;

       // j = i << s;
        j = i << j;
       // j = i << d;
        j = i << l;

      //  Correct:Only integers can be used in the right part of the shift operators.

        System.out.println(010 | 4); //12
        //Correct:1000 | 0100 = 1100

}}
