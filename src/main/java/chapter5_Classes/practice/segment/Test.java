package chapter5_Classes.practice.segment;

import java.awt.geom.Line2D;

public class Test {
    public static void main(String[] args) {

        Line2D line1 = new Line2D.Float(0, 3, 9, 0);
        Line2D line2 = new Line2D.Float(0, 2, 2, 0);
        boolean result = line2.intersectsLine(line1);
        System.out.println(result); //

    }
}
