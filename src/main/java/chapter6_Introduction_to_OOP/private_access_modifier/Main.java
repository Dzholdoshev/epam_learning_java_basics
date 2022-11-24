package chapter6_Introduction_to_OOP.private_access_modifier;

public class Main {
    public static void main(String[] arg) {
        Car fastCar = new Car();
        // fastCar.speed = 100;  there is no access
        fastCar.setSpeed(100);  // you can change the Speed's value using setSpeed method
        System.out.println(fastCar.getSpeed());
    }
}