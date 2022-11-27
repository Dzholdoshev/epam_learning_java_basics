package chapter6_Introduction_to_OOP.inheritance_part1;

public class ElectricCar extends Car {  }
class Program {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Wheels");
        car.show();

        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning");
        electricCar.show();
    }
}