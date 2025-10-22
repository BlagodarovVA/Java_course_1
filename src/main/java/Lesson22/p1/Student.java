package Lesson22.p1;

import Lesson22.Human3;

public class Student extends Human3 {           // класс наследуется от Human3
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}