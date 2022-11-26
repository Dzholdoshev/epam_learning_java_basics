package chapter5_Classes.practice.segment;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {

        System.out.println("testIntersection{Segment, Segment, Point}[5]");
        Segment seg5_1 = new Segment(new Point(2, 5), new Point(0.5, 1.5));
        Segment seg5_2 = new Segment(new Point(0, 2), new Point(5, 5));
        Point intersection5_1 = seg5_1.intersection(seg5_2);
        System.out.println("intersection X: " + intersection5_1.getX());
        System.out.println("intersection Y: " + intersection5_1.getY());

        System.out.println("testIntersection{Segment, Segment, Point}[3]");
        Segment seg3_1 = new Segment(new Point(0, 0), new Point(4, 4));
        Segment seg3_2 = new Segment(new Point(2, 0), new Point(0, 2));
        Point intersection3_1 = seg3_1.intersection(seg3_2);
        System.out.println("intersection X: " + intersection3_1.getX());
        System.out.println("intersection Y: " + intersection3_1.getY());





        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println("length: " + length);

        Segment first = new Segment(new Point(0, 0), new Point(4, 4));
        Segment second = new Segment(new Point(2, 0), new Point(0, 2));
        Point intersection = first.intersection(second);

        System.out.println("intersection X: " + intersection.getX());
        System.out.println("intersection Y: " + intersection.getY());


        Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
        Point midpoint = segment.middle();

        System.out.println("midpoint x:" + midpoint.getX());
        System.out.println("midpoint y:" + midpoint.getY());

        System.out.println("_________________");
        Segment firstS = new Segment(new Point(0, 0), new Point(4, 0));
        Segment secondS = new Segment(new Point(2, 1), new Point(1, 2));
        Point intersectionS = firstS.intersection(secondS);

        System.out.println("intersection = null: " + intersectionS == null);

        System.out.println(intersectionS.getX());
        System.out.println(intersectionS.getY());

        System.out.println("VVVV");
        //Segment TestSegment = new Segment(new Point(0, 0), new Point(0, 0));

        Segment seg1 = new Segment(new Point(0, 3), new Point(9, 0));
        Segment seg2 = new Segment(new Point(0, 2), new Point(2, 0));
        Point intersectionSeg = seg1.intersection(seg2);
        System.out.println("intersection X: " + intersectionSeg.getX()+" must be Null");
        System.out.println("intersection Y: " + intersectionSeg.getY()+" must be Null");

        Segment seg1_2 = new Segment(new Point(0, 3), new Point(4, 0));
        Segment seg2_2 = new Segment(new Point(-1, -3), new Point(1, 1));
        Point intersectionSeg_2 = seg1_2.intersection(seg2_2);
        System.out.println("intersection X: " + intersectionSeg_2.getX()+" must be Null");
        System.out.println("intersection Y: " + intersectionSeg_2.getY()+" must be Null");

        Segment seg1_1 = new Segment(new Point(0, 0), new Point(1, 1));
        Segment seg2_1 = new Segment(new Point(-1, -1), new Point(-2, -2));
        Point intersectionSeg_1 = seg1_1.intersection(seg2_1);
        System.out.println("intersection X: " + intersectionSeg_1.getX()+" must be Null");
        System.out.println("intersection Y: " + intersectionSeg_1.getY()+" must be Null");





    }
}
