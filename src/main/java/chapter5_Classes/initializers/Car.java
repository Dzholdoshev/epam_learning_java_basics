package chapter5_Classes.initializers;

public class Car {
    private  int numOfCars;
    //...
    {
        numOfCars++;
    }
    public Car() {
        //...

    }
    public Car(String model) {
        //...
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.numOfCars);
        Car c2 = new Car();
        System.out.println(c2.numOfCars);
    }
}