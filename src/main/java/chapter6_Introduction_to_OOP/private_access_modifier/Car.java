package chapter6_Introduction_to_OOP.private_access_modifier;

public class Car {
    //...
    private int speed;
    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}