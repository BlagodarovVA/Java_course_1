package Lesson25;

public class Test4 {
    public static void main(String[] args) {

        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();

        // Doctor1 d1 = (Doctor1)emp1;         // кастинг переменной позволяет ей вести себя как другой тип, если есть отношение IS-A
        System.out.println(((Doctor1)emp1).specialization);
        ((Doctor1)emp1).treat();

        IHelpable h = new Doctor1();
        h.help();
        System.out.println(((Doctor1)h).specialization);    // кастинг переменной с типом интерфейс
        ((Doctor1)h).treat();

        Employee1 e = new Employee1();
        Test4 t = new Test4();
        System.out.println(e == emp1);
        //System.out.println(e == t);                         // ошибка компилятора
        System.out.println(e.equals(t));
    }
}

class Employee1{

    String name = "Stepan";
    double salary = 3300;
    int age = 1;
    int experience;

    void eat() {
        System.out.println(name + " Кушает");
    }

    void sleep() {
        System.out.println(name + " Спит");
    }
}


class Doctor1 extends Employee1 implements IHelpable{
    String specialization = "terapevt";

    void treat() {
        System.out.println(name + " Лечит");
    }

    @Override
    public void help() {
        System.out.println("Доктор помогает");

    }
}

class Teacher1 extends Employee1 {
    int studentsQty;

    void teach() {
        System.out.println(name + " Учит");
    }
}

class Driver1 extends Employee1 {
    String carName;

    void drive() {
        System.out.println(name + " Водит");
    }
}

interface IHelpable{
    void help();
}