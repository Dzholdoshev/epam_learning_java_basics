package chapter3_Conditions_and_Loops.loop;

public class Break_and_Continue {
    public static void main(String[] arg) {
        int i = 0;
        while (true) {
            if (i > 6) {
                break;
            }
            System.out.print(i++);
        }

        System.out.println("____________________");

        int j = 0;
        while (j++ < 10) {
            if (j == 4 || j == 8) {
                continue;
            }
            System.out.print(j);
        }
    }



}
