package chapter6_Introduction_to_OOP.polymorphism.late_binding_dynamic;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10.0, 5.0);
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Figure figref;
        figref = r;
        System.out.println( figref.area() );
        figref = t;
        System.out.println( figref.area() );
        figref = f;
        System.out.println( figref.area() );
    }
}
/*
What you can see: The syntax of calling the method is the same in the three cases (figref.area()),
while the result is different. This is because the variant of the method to be invoked
is chosen during program execution and depends on the object type, not the type of reference to the object.
The objects in the three cases are different; therefore, the method area() is implemented differently.
 */