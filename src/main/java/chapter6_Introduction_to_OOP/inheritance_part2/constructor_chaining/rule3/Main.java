package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule3;


/*
If a subclass constructor does not invoke explicitly any of the superclass constructors,
the default superclass constructor should be invoked automatically.

 */
public class Main {
    public static void main(String[] arg) {
        BritishCat Cat = new BritishCat("Mulberry");
    }
}
/*
Cat default constructor
British constructor
 */