package chapter6_Introduction_to_OOP.package_private_access_modifier.main;

import chapter6_Introduction_to_OOP.package_private_access_modifier.entity.Car;

public class Main {
    public static void main(String[] arg) {

        Car fastCar = new Car();

       // fastCar.speed = 100; No access because it is located in another package
        fastCar.setSpeed(100);
        System.out.println(fastCar.getSpeed());
    }
}