package chapter6_Introduction_to_OOP.static_modifier.example2;

public class Car {
    private int numOfCars;
    //other fields
    public Car() {
        numOfCars++;
    }
    //other methods
    public int getNumOfCars() {
        return numOfCars;
    }
}