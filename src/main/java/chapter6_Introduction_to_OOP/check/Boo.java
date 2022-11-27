package chapter6_Introduction_to_OOP.check;

public class Boo {
    static int i;
    public static void main(String[] args) {
        System.out.print(i);
    }

    //In the absence of explicit initialization, a static field will receive a default value.
    // For the type int, this will be 0. The static method main has access to the static field of its class, which means the output will be 0.
}