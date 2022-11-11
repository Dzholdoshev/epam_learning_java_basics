package chapter3_Conditions_and_Loops.loop;

/**The statements break and continue in the Java language are special because they can be used with a label.
 A label is a legal identifier that can be used to mark looping statements. In that case,
 the label is separated from the statement with a colon. The statements break and continue with a label
 can be used only when the program has nested loops.
 The statement break with a label is used in nested loops and exits the loop that is marked
 with the specified label.   */

public class With_Label {
    public static void main(String[] args) {
        int i = 0;
        outer: while ( i < 5) {
            int j = 0;
            while (j < 2) {
                j++;
                System.out.println("i=" + i + ", j=" + j);
                break outer;
            }
        }

        int k = 0;
        outer: while (k++ < 3) {
            int l = 0;
            while (l++ < 5) {
                if (l == 2) {
                    continue outer;
                    //it will skip both inner and outer loops
//                    k = 1; l = 1
//                    k = 2; l = 1
//                    k = 3; l = 1

                    //continue ;  it will skip only inner loop l=2
//                    k = 1; l = 1
//                    k = 1; l = 3
//                    k = 1; l = 4
//                    k = 1; l = 5
//                    k = 2; l = 1
//                    k = 2; l = 3
//                    k = 2; l = 4
//                    k = 2; l = 5
//                    k = 3; l = 1
//                    k = 3; l = 3
//                    k = 3; l = 4
//                    k = 3; l = 5

                }
                System.out.println("k = " + k + "; l = " + l);
            }
        }

}
}
