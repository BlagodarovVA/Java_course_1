package Lesson22;

public class Test3 {

    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "Diana";
        doc.age = 28;
        doc.experience = 4;
        doc.specialization = "neirohirurg";
        doc.eat();
        doc.sleep();
        doc.treat();
    }

}

// родительский класс
// Для Employee родительский класс Object
class Employee{
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println(name + " Кушает");
    }

    void sleep() {
        System.out.println(name + " Спит");
    }
}

// наследуемые классы
class Doctor extends Employee{
    String specialization;
    void treat() {
        System.out.println(name + " Лечит");
    }
}

class Teacher extends Employee{
    void teach() {
        System.out.println(name + " Учит");
    }
}

class Driver extends Employee{
    void drive() {
        System.out.println(name + " Водит");
    }
}