package chapter6_Introduction_to_OOP.polymorphism.typecasting;

public class Cat {
    public void move() { System.out.println("Cat move"); }
}
class BritishCat extends Cat {
    @Override
    public void move() { System.out.println("British cat move"); }
}
class PersianCat extends Cat {
    @Override
    public void move() { System.out.println("Persian cat move"); }
}
class Main {
    public static void main(String[] arg) {
        Cat cat = new BritishCat();
        cat.move();
        BritishCat cat2 = (BritishCat)cat;
        cat2.move();



        if (cat instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) cat;
        } else {
            System.out.println("Not Persian cat!");
        }

        //PersianCat cat3 = (PersianCat)cat; //ClassCastExeption

    }
}