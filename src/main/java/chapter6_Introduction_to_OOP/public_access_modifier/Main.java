package chapter6_Introduction_to_OOP.public_access_modifier;

public class Main {
    public static void main(String[] arg) {
        Car fastCar = new Car();
        fastCar.speed = 100;
        System.out.println(fastCar.getSpeed());
    }
}