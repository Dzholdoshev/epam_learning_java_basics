package chapter6_Introduction_to_OOP.inheritance_part2.check;

class A {   }
class B extends A {   }
class C extends B {   }
class Main {
    public static void main(String[] args) {
        // line 0
    }
}
/*
Correct:A reference to a superclass can be assigned a subclass object.
 However, a reference to a child class can be assigned an object of the parent class
 only using explicit typecasting.
 */