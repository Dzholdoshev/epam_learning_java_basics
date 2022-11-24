package chapter6_Introduction_to_OOP.final_modifier;

public class TestFinal {
    private final String lastName;
    public TestFinal(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setlastName(String name) {
     //  this.lastName = name;  // cannot assign a value to final variable lastName
    }
}