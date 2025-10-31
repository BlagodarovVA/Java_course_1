package Lesson25;

public class Test3 {

    public static void main(String[] args) {

        IJumpable j = new Man();
        Man m = new Man();
        Student s = new Student();

        if (j instanceof IJumpable) {
            System.out.println("j is Jumpable");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
        //if (s instanceof Human) {System.out.println("s is Human");}   // ошибка, т.к. между студентом и человеком нет никакой связи
        if (s instanceof IJumpable) {
            System.out.println("s is IJumpable");                       // false
        }
    }
}

interface IJumpable{}

class Human implements IJumpable{}
class Man extends Human{}
class Student{}
