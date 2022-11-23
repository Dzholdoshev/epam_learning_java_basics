package chapter5_Classes.practice.segment;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {

    public Point start;
    public Point end;

    public Segment(Point start, Point end){
        if (start == null || end == null || (start.getX() == end.getX() && start.getY() == end.getY())) throw new RuntimeException();
        this.start = start;
        this.end = end;
    }

    double length() {
        return sqrt(pow((end.getX() - start.getX()), 2) + pow(end.getY() - start.getY(), 2));
    }

    Point middle() {
        return new Point((end.getX() + start.getX())/2, (end.getY() + start.getY())/2);
    }

    Point intersection(Segment another) {

        if((start.getX() - end.getX() == 0) && (another.start.getX() - another.end.getX() == 0)) {

            if(start.getX() == another.start.getX()) {
                return null;
            }
            return null;
        }




        if (start.getX() - end.getX() == 0) {


            double Xa = start.getX();
            double A2 = (another.start.getY() - another.end.getY()) / (another.start.getX() - another.end.getX());
            double b2 = another.start.getY() - A2 * another.start.getX();
            double Ya = A2 * Xa + b2;

            if (another.start.getX() <= Xa && another.end.getX() >= Xa && Math.min(start.getY(), end.getY()) <= Ya &&
                    Math.max(start.getY(), end.getY()) >= Ya) {

                return new Point(Xa,Ya);
            } else{
                return null;
            }
        }


        if (another.start.getX() - another.end.getX() == 0) {

            double Xa = another.start.getX();
            double A1 = (start.getY() - end.getY()) / (start.getX() - end.getX());
            double b1 = start.getY() - A1 * start.getX();
            double Ya = A1 * Xa + b1;

            if (start.getX() <= Xa && end.getX() >= Xa && Math.min(another.start.getY(), another.end.getY()) <= Ya &&
                    Math.max(another.start.getY(), another.end.getY()) >= Ya) {

                return new Point(Xa,Ya);
            }else{
                return null;
            }
        }


        double A1 = (start.getY() - end.getY()) / (start.getX() - end.getX());
        double A2 = (another.start.getY() - another.end.getY()) / (another.start.getX() - another.end.getX());
        double b1 = start.getY() - A1 * start.getX();
        double b2 = another.start.getY() - A2 * another.start.getX();
        double delta = (start.getX() - end.getX())*(another.start.getY() - another.end.getY()) - (start.getY() - end.getY())*(another.start.getX() - another.end.getX());

        double Xa = (b2 - b1) / (A1 - A2);
        double Ya = A1 * Xa + b1;

        if(delta!=0 && (Xa<=Math.max(start.getX(), end.getX())) && (Xa>=Math.min(start.getX(), end.getX())) && (Xa<=Math.max(another.start.getX(), another.end.getX())) && (Xa>=Math.min(another.start.getX(), another.end.getX()))){
            return new Point(Xa, Ya);
        } else {
            System.out.println(delta);
            return null;
        }
    }








    /*
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
       double xPoint = (((start.getX()*end.getX()- start.getY()*end.getX())*(another.start.getX()- another.end.getX())-(start.getX()-end.getX())*(another.start.getX()* another.end.getY()-another.start.getY()*another.end.getX())))/((start.getX()-end.getX())*(another.start.getY()-another.end.getY())-(start.getY()-end.getY())*(another.start.getX()-another.end.getX()));
       if(xPoint >= start.getX() && xPoint <= end.getX() || xPoint >= end.getX() && xPoint <= start.getX())
       {return null;}
        double yPoint = (((start.getX()*end.getY()-start.getY()*end.getX())*(another.start.getY()- another.end.getY())-(start.getY()-end.getY())*(another.start.getX()* another.end.getY()-another.start.getY()*another.end.getX())))/((start.getX()-end.getX())*(another.start.getY()-another.end.getY())-(start.getY()-end.getY())*(another.start.getX()-another.end.getX()));
       if (xPoint >= another.start.getX() && xPoint <= another.end.getX() || xPoint >= another.end.getX() && xPoint <= another.start.getX())
       {return null;}

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

// need to check test #12,#11, #10
//
     */


 /*  Point intersection(Segment another) {

        Point point;
        if ((start.getX()-end.getX())*(another.start.getY()-another.end.getY())-(start.getY()-end.getY())*(another.start.getX()-another.end.getX()) != 0){
            double xPoint = (((start.getX()*end.getX()- start.getY()*end.getX())*(another.start.getX()- another.end.getX())-(start.getX()-end.getX())*(another.start.getX()* another.end.getY()-another.start.getY()*another.end.getX())))/((start.getX()-end.getX())*(another.start.getY()-another.end.getY())-(start.getY()-end.getY())*(another.start.getX()-another.end.getX()));
            double yPoint = (((start.getX()*end.getY()-start.getY()*end.getX())*(another.start.getY()- another.end.getY())-(start.getY()-end.getY())*(another.start.getX()* another.end.getY()-another.start.getY()*another.end.getX())))/((start.getX()-end.getX())*(another.start.getY()-another.end.getY())-(start.getY()-end.getY())*(another.start.getX()-another.end.getX()));
            double checkPoint =  (((xPoint-start.getX())*(end.getY()-start.getY()))-((yPoint-start.getY())*(end.getX()-start.getX())));
            double checkPointAnother =  (((xPoint-another.start.getX())*(another.end.getY()-another.start.getY()))-((yPoint-another.start.getY())*(another.end.getX()-another.start.getX())));
            if (checkPoint == 0 && checkPointAnother == 0){
                if(xPoint >= start.getX() && xPoint <= end.getX() || xPoint >= end.getX() && xPoint <= start.getX()){
                    if (xPoint >= another.start.getX() && xPoint <= another.end.getX() || xPoint >= another.end.getX() && xPoint <= another.start.getX()){
                        point = new Point(xPoint, yPoint); //Все проверки прошли
                    }else{
                        point = null; //Координата X 2-го отрезка не попала в диапазон
                    }
                } else {
                    point = null; //Координата X 1-го отрезка не попала в диапазон
                }
            } else {
                point = null; //Не прошла проверка двух векторов
            }
        } else {
            point = null; //Не прошла проверка знаменателя
        }
        return point;
    }

  */



}

