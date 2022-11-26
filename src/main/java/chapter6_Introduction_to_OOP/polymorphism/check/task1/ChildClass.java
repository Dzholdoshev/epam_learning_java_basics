package chapter6_Introduction_to_OOP.polymorphism.check.task1;

class ChildClass extends ParentClass{
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }
    public static void main(String args[]) {
        ParentClass quest = new ChildClass ();   // 1
        quest.parentMethod(1);   // 2
        // quest.childMethod(1);   // 3  com
    }
}
/*
Answer
Correct:There will be no error in line 1 since a safe upcasting is performed.
A polymorphic method is being called in the second line.
A compilation error will occur when trying to call a method that belongs only
to the subclass using a reference to the superclass through which it cannot be accessed.
 */