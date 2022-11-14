package chapter5_Classes.practice.segment;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {

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
        System.out.println("intersection X: " + intersectionSeg.getX());
        System.out.println("intersection Y: " + intersectionSeg.getY());



    }
}
