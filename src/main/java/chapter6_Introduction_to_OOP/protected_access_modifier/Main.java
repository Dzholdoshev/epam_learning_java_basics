package chapter6_Introduction_to_OOP.protected_access_modifier;

public class Main {
    public static void main(String[] arg) {
        Car fastCar = new Car();
        fastCar.speed = 100; // it's possible to access becouse both are in the same package
        System.out.println(fastCar.getSpeed());
    }
}