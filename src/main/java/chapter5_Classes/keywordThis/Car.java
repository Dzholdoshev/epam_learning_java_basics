package chapter5_Classes.keywordThis;

public class Car {
    private String model;
    private int year;
    private int speed;




    public void setSpeed(int speed) {
        this.speed = speed;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (speed != car.speed) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + speed;
        return result;
    }
}