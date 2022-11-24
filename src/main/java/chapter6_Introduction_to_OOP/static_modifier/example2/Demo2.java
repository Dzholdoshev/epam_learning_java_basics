package chapter6_Introduction_to_OOP.static_modifier.example2;

public class Demo2 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(сar3.getNumOfCars()); // 1 because every object has its own numOfCars,
        // the correct way is to use "static" =>3

    }
}