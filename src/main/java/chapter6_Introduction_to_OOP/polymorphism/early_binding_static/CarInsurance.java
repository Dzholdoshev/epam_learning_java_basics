package chapter6_Introduction_to_OOP.polymorphism.early_binding_static;

public class CarInsurance extends Insurance {
    public static final int HIGH = 200;
    @Override
    public int getPremium() {
        return HIGH;
    }
    public static String getCategory() {
        return "CarInsurance";
    }
}