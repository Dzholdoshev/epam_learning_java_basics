package chapter6_Introduction_to_OOP.polymorphism.late_binding_dynamic;

public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Area of the triangle ");
        return dim1 * dim2 / 2;
    }
}