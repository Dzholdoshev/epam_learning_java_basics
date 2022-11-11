package chapter4_Arrays;

public class Check {
    public static void main(String[] args) {


        String[ ] names[ ]; //correct
        // int numbers [] = new int[2] {10, 20}; incorrect
        float[ ] f1[ ], f2;  //correct
        int[] scores = {1, 2, 3, 4}; //correct

        //_____________________________________________________

        //2. What is the result of running the following code?
        String[] ejgStr = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } }[0];
        String[] ejgStr1 = null;
        String[] ejgStr2 = { null };
        System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]);

        //Correct:The NullPointerException exception will appear when trying
        // to index the array initialized by the literal expression null.
        // The literal expression null cannot be indexed.
        // Neither can you use it to access the fields and methods of any object.

    }
}
