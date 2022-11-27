package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule2;

/*
An explicit invocation (super) to a superclass constructor should be
the first operator in the body of the subclass constructor.
 */

public class Main {
    public static void main(String[] arg) {
        BritishCat Cat = new BritishCat("Mulberry");
    }
}
/*
Cat constructor – name Mulberry

British constructor
 */