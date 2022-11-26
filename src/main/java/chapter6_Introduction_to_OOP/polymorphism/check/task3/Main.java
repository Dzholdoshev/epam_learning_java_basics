package chapter6_Introduction_to_OOP.polymorphism.check.task3;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.version + a.testMethod());
    }
}
/*
Answer 1.0 AB

Correct:When calling a method here, the mechanism of late binding will be used.
Therefore, the method will be called not based on the type of reference variable but based
 on a specific object, which means that the class B method will be called.
  In Java, fields are not polymorphic, so the field will be used based on the reference variable type.
 */