package chapter6_Introduction_to_OOP.inheritance_part1.super_keyword;

public class Student extends Person{

    private int yearOfStudy;

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, String name, int yearOfStudy) {
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, int yearOfStudy) {
        this(yearOfStudy);
    }

    public Student(String name, int yearOfStudy) {
        super(name);
       // this(yearOfStudy); //In a class constructor, you can't call constructors through this() and super() at the same time.

    }


    public void giveId(int num){
        System.out.println("Overloaded");
    }




}
