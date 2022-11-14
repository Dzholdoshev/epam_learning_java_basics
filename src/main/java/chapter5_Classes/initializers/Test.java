package chapter5_Classes.initializers;

public class Test {

    static String print(){
        System.out.println("World");
        return null;
    }

    static String x = print();
    static {
        System.out.println("Hello");
    }




    public static void main(String[] args) {

    }
}