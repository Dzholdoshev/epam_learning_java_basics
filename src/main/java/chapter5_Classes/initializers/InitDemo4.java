 package chapter5_Classes.initializers;

public class InitDemo4 {


    private static int ii = initSt();

    //...
    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }
    //...
    public static void main(String[] arg) {
        System.out.println("Main");
        System.out.println("int: " + ii);
    }
}