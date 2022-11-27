package chapter6_Introduction_to_OOP.inheritance_part1.super_keyword;

public class Person {
  private int id;
  private String name="";

  public Person(){

  }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void giveId(){
        System.out.println("Original");
    }
}
