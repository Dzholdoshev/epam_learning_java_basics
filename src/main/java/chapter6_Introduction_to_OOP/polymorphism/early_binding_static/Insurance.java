package chapter6_Introduction_to_OOP.polymorphism.early_binding_static;

public class Insurance {
    public static final int LOW = 100;
    public int getPremium() {
        return LOW;
    }
    public static String getCategory() {
        return "Insurance";
    }
}