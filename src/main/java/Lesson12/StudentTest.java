package Lesson12;

import Lesson11.Student;

import java.util.Objects;

public class StudentTest {

    public static void compareObjLink(Student st1, Student st2) {
        System.out.println((Objects.equals(st1.name, st2.name)
                        && st1.course == st2.course
                        && st1.grade == st2.grade) ? "Identical" : "Different");
    }

    public static void compareAttrObj(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты одинаковы по всем атрибутам");
                } else {
                    System.out.println("Студенты отличаются по оценке");
                }
            } else {
                System.out.println("Студенты отличаются по курсу");
            }
        } else {
            System.out.println("Студенты отличаются по имени");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Valery", 5, 7.5);
        Student st2 = new Student("Valery", 5, 7.5);

        compareObjLink(st1, st2);

        compareAttrObj(st1, st2);

    }
}
