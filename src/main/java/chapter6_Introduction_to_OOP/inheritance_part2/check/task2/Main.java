package chapter6_Introduction_to_OOP.inheritance_part2.check.task2;

class Person {
    String version = "Person";
    public void method1(){};
}
class Student extends Person {
    String version = "Student";
    public void method2(){};
}
public class Main {
    public static void main(String[] args) {
        Person person = new Student ();
        System.out.println(person.version);
        Student student = new Student();

        person.method1();// person has only the access to method1
        student.method1(); //// student has  the access to both methods
        student.method2();
    }
}
/*
Answer
Correct:In Java, fields are not polymorphic.
This means that it depends on the reference and not the object type of the field accessed
 from outside of the subclass body. In this case, the class Student has two fields
 with the name version (its own and inherited).
 The field is accessed through a reference to the superclass Person;
 thus, the inherited field will be used.
 */