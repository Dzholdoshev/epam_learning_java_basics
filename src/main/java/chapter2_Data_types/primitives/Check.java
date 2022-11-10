package chapter2_Data_types.primitives;

public class Check {
    public static void main(String[] args) {
        double m1 = 5_000_000.75;   //correct
     //   long m2 = _5_000_000;
     //   int m = 0b_1010;
        int m4 = 5_000_000;         //correct
        int m5 = 0_10;              //correct
     //   int m6 = 5_000_000_;
       // Answer
       // Correct:The underscore symbol may only be used between digits.
        // You can use any number of underscores between digits.
        // The underscore symbol may not be used before the first and after
        // the last digits of the literal, as well as before the suffix or prefix.


        byte a = 0b0001_1110;
        byte b = 1_____14;
        // short s = 46_;
       // int i = _78;
       // Answer
       // Correct:The '_' symbol may not start or complete the declaration of a numeric literal.

    }
}
