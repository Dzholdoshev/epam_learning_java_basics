package chapter6_Introduction_to_OOP.polymorphism.early_binding_static;

public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        CarInsurance carInsurance = new CarInsurance();
        Insurance insurance = new Insurance();

        System.out.println("category: " + current.getCategory() );
       // System.out.println("category: " + CarInsurance.getCategory() );
    }
}
/*
category: Insurance
category: CarInsurance

As you can see, calling an option of the static method depends on the type of reference to the object,
 not the object type. In the given case, the way the method getCategory()
  is called depends on the reference type of the object current, meaning the type Insurance.
 */