package chapter5_Classes.creatingObject;

public class Car {
    private String carModel;
    public String getCarModel() {
        return carModel;
    }
}
class Demo {
    public static void  main(String[] arg) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        String name = car1.getCarModel();
        System.out.println(name);
    }
}