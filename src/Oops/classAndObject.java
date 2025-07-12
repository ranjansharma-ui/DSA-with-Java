package Oops;
import java.util.*;

class Student{
    int rollno = 345;
    String name = "Madhav";

    void getting(){


    }

}

public class classAndObject extends Student
{
    int rollno = 89;
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name.charAt(0));
        s.getting();

        classAndObject a = new classAndObject();
        System.out.println(a.name);
        System.out.println(a.rollno);
//        System.out.println(rollno);

    }
}
