package chapter3_Conditions_and_Loops.loop;

class TestDoWhile  {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i > 5 && i < 10);
    }
}