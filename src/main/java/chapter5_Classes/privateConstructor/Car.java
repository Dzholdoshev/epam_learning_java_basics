package chapter5_Classes.privateConstructor;

public class Car {
    private String model;
    private String brand;
    public Car() {
        this("Camry", "Toyota");
        System.out.println("Init");
    }
    public Car(String model) {
        this(model, "Toyota");
    }
    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}