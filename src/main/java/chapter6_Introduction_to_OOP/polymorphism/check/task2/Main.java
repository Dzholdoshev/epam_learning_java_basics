package chapter6_Introduction_to_OOP.polymorphism.check.task2;

public class Main {
    public static void main(String[] args) {
        Base object = new SubClass();
        object.print();
    }
}

/*
Answer  SubClass

Correct:When calling a method here, the mechanism of late binding will be used.
Therefore, the method will be called not based on the type of reference variable
but based on a specific object, which means that the class B method will be called.
 */