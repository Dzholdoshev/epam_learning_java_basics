package chapter6_Introduction_to_OOP.package_private_access_modifier.entity;
public class Car {
    //...
    int speed;

    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}
