package chapter5_Classes.finalExample;

public class Point {
    private final int MAX_RANGE = 1_000;
    final StringBuilder builder = new StringBuilder();
    private int x;
    private String name;

    public Point(int x) {
        this.x = x;
        builder.append("Hello");
    }



    public static void main(String[] args) {
        System.out.println(new Point(1).builder.toString());
    }

}
