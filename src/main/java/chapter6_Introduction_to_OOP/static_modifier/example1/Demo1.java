package chapter6_Introduction_to_OOP.static_modifier.example1;

public class Demo1 {
    public static void main(String[] s) {
        StaticDemo.callme(); // calling class method without creating a class instance
        System.out.print("b = " + StaticDemo.b); //accessing a class field
    }
}