package chapter6_Introduction_to_OOP.check;

import java.util.Arrays;
import java.util.stream.Collectors;

public class University {
    public static void main(String[] args) {
        JavaCourse courses[] = { new JavaCourse(), new JavaCourse() };


        Arrays.stream(courses).forEach(javaCourse -> System.out.println(javaCourse.courseName));
        courses[0].courseName = "MegaCourse";
        for (JavaCourse c : courses) {
            c =  new JavaCourse(); //Do not use for each loops if you need to change the values in the array.
        }
        for (JavaCourse c : courses) {
            System.out.println(c.courseName);
        }
    }
    //MegaCourse
    //Java
}