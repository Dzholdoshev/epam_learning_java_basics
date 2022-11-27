package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule4;

/*
If a superclass has no default constructor and the subclass constructor does not invoke
another superclass constructor explicitly, the Java compiler will throw an error.
 */
class SuperClass {  }
class SubClass extends SuperClass {  }
public class Main{
    public static void main(String[] arg) {
        SubClass c = new SubClass();
    }
}