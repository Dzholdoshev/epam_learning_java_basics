package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule2;

public class BritishCat extends Cat {
    BritishCat(String name) {
        super(name);
        System.out.println("British constructor");
    }
}