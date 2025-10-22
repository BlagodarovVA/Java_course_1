package Lesson22;

public class Test5 {

}

class Human5 {

    String name;
    String surname;

    Human5(String n) {
        System.out.println("Human5 - constructor 1");
    }

    Human5(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Human5 - constructor 2");
    }

}

class Student3 extends Human5{

    int course;

    // ошибка без super, т.к. в родительском классе нет конструктора без параметров,
    // а по умолчанию вызывается конструктор родителя без параметров
    Student3(String s){
        super(s);                               // чтобы не было ошибки обращаемся к существующему конструктору
        System.out.println("constructor 1");
    }

    Student3(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
        System.out.println("constructor 2");
    }


    public static void main(String[] args) {

        Student3 s1 = new Student3("ok");
        System.out.println("----------");
        Student3 s2 = new Student3("Sergey", "Ivanov", 3);
        System.out.println(s2.name);
        System.out.println(s2.surname);
        System.out.println(s2.course);

    }
}
