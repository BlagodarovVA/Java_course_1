package Lesson23;

public class Test2 {

    public Object abc() {
        return new Doctor();                // можно вернуть любой тип, т.к. Object - родитель для всех
    }

    public static void main(String[] args) {

        Doctor doc = new Doctor();
        Doctor doc2 = new Hirurg();
        Teacher t = new Teacher();
        Driver d = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();           // переменная может ссылаться на объект дочернего класса
        Employee emp2 = new Teacher();          // переменная СУПЕРкласса может ссылаться на любой объект СУБкласса
        Employee emp3 = new Driver();           // но вызвать можно только унаследованные от super класса элементы
        Employee emp4 = new Hirurg();

        //Driver d2 = new Employee();             // наоборот не правильно


        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

        //emp1.treat();         // ошибка, т.к. тип переменной Employee, а не Doctor, хотя объект создан Doctor


    }

}


class Employee{

    String name = "Stepan";
    double salary = 1000;
    int age = 1;
    int experience;

    void eat() {
        System.out.println(name + " Кушает");
    }

    void sleep() {
        System.out.println(name + " Спит");
    }
}


class Doctor extends Employee {
    String specialization;
    void treat() {
        System.out.println(name + " Лечит");
    }
}

class Hirurg extends Doctor{
    String skalpel;
    void opertion(){}
}

class Teacher extends Employee {

    int studentsQty;

    void teach() {
        System.out.println(name + " Учит");
    }
}

class Driver extends Employee {

    String carName;

    void drive() {
        System.out.println(name + " Водит");
    }
}
