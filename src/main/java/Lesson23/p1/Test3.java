package Lesson23.p1;

public class Test3 {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.eat();
        Teacher t = new Teacher();
        t.eat();

        Employee e1 = new Teacher();
        e1.eat();                       // вызовется переопределенный метод для учителя, т.к. объект учитель
    }

}

class Food{
}
class Fruit extends Food {
}

class Employee{

    String name = "Stepan";
    double salary = 1000;
    int age = 1;
    int experience;

    public Food eat() {
        System.out.println("Работник кушает");
        return new Food();
    }

    void sleep() {
        System.out.println(name + " Спит");
    }
}

class Teacher extends Employee {

    int studentsQty;

    void teach() {
        System.out.println(name + " учит");
    }

    // переопределение метода для класса с тем же именем
    @Override
    public Food eat() {         // access modifier должен быть таким же или менее строгим, чем родительский
        System.out.println("Учитель " + name + " кушает");
        return new Food();
    }

}

class Driver extends Employee {

    String carName;

    void drive() {
        System.out.println(name + " Водит");
    }

    // переопределение метода для класса с типов возврата дочерним от возвращаемого типа родителя
    // т.е. Fruit дочерний тип от Food
    @Override
    public Fruit eat() {
        System.out.println("Водитель " + name + " кушает");
        return new Fruit();
    }
}

