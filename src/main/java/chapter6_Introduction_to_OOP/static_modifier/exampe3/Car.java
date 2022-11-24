package chapter6_Introduction_to_OOP.static_modifier.exampe3;

public class Car {
    private static int numOfCars; 
    //other fields  
    public Car() { 
        numOfCars++; 
    }
    //other methods
    public static int getNumOfCars() {
        return numOfCars;
    }
}