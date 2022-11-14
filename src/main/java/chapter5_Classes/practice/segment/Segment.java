package chapter5_Classes.practice.segment;

class Segment {

    Point start;
    Point end;


    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        isEqual(start, end);
    }


    boolean isEqual(Point start, Point end) {
        if (start.getX() == end.getX()
                && start.getY() == end.getY()) {
            throw new IllegalArgumentException();
        } else {
            return false;
        }
    }

    double length() {
        return Math.sqrt(
                Math.pow((start.getX() - end.getX()), 2) +
                        Math.pow((start.getY() - end.getY()), 2));
    }

    Point middle() {
        return new Point((start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2);
    }

    Point intersection(Segment another) {
        if ((end.getY() - start.getY() / end.getX() - start.getX()) == another.end.getY() - another.start.getY() / another.end.getX() - another.start.getX()) {
            return null;
        }
        double A1 = another.end.getY() - another.start.getY();
        double B1 = another.start.getX() - another.end.getX();
        double C1 = A1 * another.start.getX() + B1 * another.start.getY();

        double A2 = end.getY() - start.getY();
        double B2 = start.getX() - end.getX();
        double C2 = A2 * start.getX() + B2 * start.getY();

        double det = A1 * B2 - A2 * B1;
        if (det == 0) {
            return null;
        }
        double x = (B2 * C1 - B1 * C2) / det;
        double y = (A1 * C2 - A2 * C1) / det;


            return new Point(x, y);




    }

}

