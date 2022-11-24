package chapter6_Introduction_to_OOP.protected_access_modifier;

public class Car {
    //...
    protected int speed;
    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}