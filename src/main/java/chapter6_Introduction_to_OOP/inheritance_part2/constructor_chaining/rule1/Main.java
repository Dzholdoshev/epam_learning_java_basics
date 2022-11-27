package chapter6_Introduction_to_OOP.inheritance_part2.constructor_chaining.rule1;


/*
When creating a subclass object, constructors of all the superclasses in its inheritance chain
are invoked in the order of their inheritance, from superclass to subclass.
This means that the chain of inheritance is followed from the topmost superclass.
Then constructors are executed one by one, following the hierarchy from top to bottom.
 */
public class Main {
    public static void main(String[] arg) {
        BritishCat Cat = new BritishCat();
    }
}

/*
Cat constructor
British constructor
 */