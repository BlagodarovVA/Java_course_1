package Lesson25;

public class Test5 {
    public static void main(String[] args) {

        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp4 = new Employee2();

        Employee2 [] array = {emp1, emp2, emp3, emp4};
        for (Employee2 e:array){
            if (e instanceof Driver2){
                System.out.println(((Driver2)e).carName);
                ((Driver2)e).drive();
            }
        }
    }
}


class Employee2{

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


class Doctor2 extends Employee2 implements IHelpable2{
    String specialization = "terapevt";

    void treat() {
        System.out.println(name + " Лечит");
    }

    @Override
    public void help() {
        System.out.println("Доктор помогает");

    }
}

class Teacher2 extends Employee2 {
    int studentsQty;

    void teach() {
        System.out.println(name + " Учит");
    }
}

class Driver2 extends Employee2 {
    String carName = "Volkswagen";

    void drive() {
        System.out.println(name + " Водит");
    }
}

interface IHelpable2{
    void help();
}