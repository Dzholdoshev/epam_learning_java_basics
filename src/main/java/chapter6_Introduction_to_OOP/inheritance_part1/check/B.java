package chapter6_Introduction_to_OOP.inheritance_part1.check;

public class B extends  A  {
    public void job(int i) {
        System.out.println("Class B");
    }
    public static void main(String [] args) {
        B b = new B();
        b.job();
    }
}// Answer: Class A
//Correct:The version of the overloaded method is always determined at the stage of code compilation.