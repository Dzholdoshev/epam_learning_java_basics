package chapter5_Classes.practice.triangle;

public class Main {
    public static void main(String[] args) {

       // new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));

        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);

        Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

        System.out.println(centroid.getX());
        System.out.println(centroid.getY());

        new Triangle(new Point(0, 0), new Point(1, 1), new Point(0, 1));
        new Triangle(new Point(-2, 2), new Point(-3, 1), new Point(0, 1));

       // new Triangle(null, new Point(-3, 1), new Point(0, 1));
        //new Triangle(new Point(0, 1), null, new Point(-3, 1));



    }
}
