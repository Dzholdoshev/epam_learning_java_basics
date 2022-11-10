package chapter2_Data_types.operators;

public class Ternary_operators {
    public static void main(String[] args){
        int experience = 5;
        int requirements = 10;
        String result = (experience > requirements) ? "Accept to project" : "Learn more" ;
        System.out.println( result );
    }
}
