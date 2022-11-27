package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule3;

public class Cat {
    Cat() {
        System.out.println("Cat default constructor");
    }
    Cat(String name) {
        System.out.println("Cat constructor " + name);
    }
}