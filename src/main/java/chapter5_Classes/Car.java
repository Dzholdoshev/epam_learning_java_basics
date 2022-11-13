package chapter5_Classes;

public class Car {
    private String model;   //fields
    private int maxSpeed;   //fields
    private int year;       //fields
    public Car (String model, int year, int maxSpeed) { //constructor - special method for creating objects of this class
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {  //method
        return maxSpeed;
    }
}