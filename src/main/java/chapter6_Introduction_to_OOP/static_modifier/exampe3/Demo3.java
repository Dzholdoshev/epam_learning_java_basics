package chapter6_Introduction_to_OOP.static_modifier.exampe3;

public class Demo3 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(Car.getNumOfCars()); //3
    }
}