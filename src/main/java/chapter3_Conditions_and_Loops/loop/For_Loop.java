package chapter3_Conditions_and_Loops.loop;

public class For_Loop {
    public static void main(String[] args) {

        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("\n Iteration initialization");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("Iteration completion");
        }

    }
}
