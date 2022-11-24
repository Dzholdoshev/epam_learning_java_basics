package chapter6_Introduction_to_OOP.static_modifier.example1;

public class StaticDemo {
    static int a = 42;   // static variable  =>  class field
    static int b = 99; 
    static void callme() {
        System.out.println("a = " + a);
    } //static variable  =>  class method
}

