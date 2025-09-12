package Lesson10;

import Lesson9.*;                   // весь пакет
import Lesson9.Student;             // 1 класс
import java.lang.*;                 // коробочные классы импортируются всегда сами, поэтому строка бесполезна
import static Lesson9.Student.c;    // импорт 1 переменной
import static Lesson9.Student.*;    // все статичные переменные класса


public class A {

    static String coconut = "oreh";     // переменная из другого класса без явного указания не возьмется, т.к. есть своя

    public static void main(String[] args) {

        Car c1 = new Car("red", "V3");

        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c);  // через имя класса, т.к. статическая

        String str1 = new String("Hi");
        java.lang.String str2 = new String("Bye");

        System.out.println("imported int - " + c);
        System.out.println("imported str - " + coconut);

        /*
        * многострочный
        * коммент
        * в java
        */

        /** java doc comment
         * служит для описания
         * работы классов
         */
    }
}

class B {
    Student st3 = new Student();

}