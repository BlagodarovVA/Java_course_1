package Lesson23;

public class Test6 {
}

class Employee2{

    static String name = "Petr";
    double salary = 1000;

    static void sleep() {
        System.out.println("Работник " + name + " cпит");
    }
}

class Teacher2 extends Employee2 {

    double salary = 2000;                                   // hiding - переменная родительского класса скрывается дочерней
    int studentsQty;

    void teach() {
        System.out.println(name + " учит");
    }

    static void sleep() {                                   // hiding - метод родительского класса скрывается дочерним
        System.out.println("Учитель " + name + " cпит");
    }

}