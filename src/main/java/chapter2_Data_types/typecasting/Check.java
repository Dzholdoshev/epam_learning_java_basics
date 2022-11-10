package chapter2_Data_types.typecasting;

public class Check {
    public static void main(String[] args) {

        int i = 3;
        byte b = 1;
        byte b1 = 1 + 2;                // line 1
       // short s = 304111;               // line 2  // out of range
        short s1 = (short) 304111;      // line 3
      //  b = b1 + 1;                     // line 4
        b = (byte)  (b1 + 1);           // line 5
       // b = -b;                         // line 6
        b = (byte) -b;                  // line 7
        b1 *= 2;                        // line 8
       // b = i;                          // line 9
        b = (byte)  i;
        b += i++;
        float f = 1.1f;
        b /= f;

        //Answer
        //Correct:
        // Line 2: the maximum possible value for short is equal to 32767.
        // Line 4: the addition operation will result in int. Besides, b1 was not declared as final.
        // Line 6: the unary negation will result in a value of the type int.
        // Line 9: the type int assigns the type byte without an explicit conversion.


        long x = 5;
        long y = 2;
       // byte b = (byte) x / y;
        //Answer
        //Correct:The code will not be compiled, since only the first operand of the division operation can be reduced to the type byte.
        // For a successful compilation, the code shall be written as (byte) (x / y);
        //SubmitSome problems have options such as save, reset, hints, or show answer.
        // These options follow the Submit button.

    }
}
