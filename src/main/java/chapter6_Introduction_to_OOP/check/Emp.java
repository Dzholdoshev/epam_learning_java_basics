package chapter6_Introduction_to_OOP.check;

public class Emp {
    final static public int MIN_AGE = 20;
    static final int MAX_AGE = 70;
    final static int AVR_AGE = 70;
}
//The compilation will be error-free since rearranging modifiers when declaring fields does not play any role here.
// However, by convention, the sequence public static final should be considered correct.