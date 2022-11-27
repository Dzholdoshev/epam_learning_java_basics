package chapter6_Introduction_to_OOP.check;

public class Booo {
    public static void main(String[] args) {
        fooMaxChange();
    }
    static void fooMaxChange(){
      //  Foo.FOO_MAX *= 2;
        System.out.print(Foo.FOO_MAX);
        //Correct:A compilation error in the line Foo.FOO_MAX *= 2;
        // occurs as a result of an attempt to change the value of a final field.
    }
}