package chapter5_Classes.practice.intersection;

public class Line {

    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {

        if (k == other.k) {
            return null;
        }

        int x = (other.b - b) / (k - other.k);
        int y = k * x + b;

        Point point = new Point(x,y);

        return point;

    }
}
