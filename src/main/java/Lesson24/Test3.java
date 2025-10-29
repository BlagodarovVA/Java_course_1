package Lesson24;

public class Test3 {

    public static void main(String[] args) {

        /* На объект класса может ссылаться:
        * - переменная такого же типа, что и сам объект
        * - типы его суперкласса
        * - типы интерфейса, которые имплементировал класс созданного объекта
         */
        Driver d = new Driver();
        Employee e = new Driver();
        IHelp_able h = new Driver();
        ISwim_able s = new Driver();

        System.out.println(h.a);
        h.help();
        h.putOutFire("voda");
    }
}

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

// можно имплементировать любое количество интерфейсов
class Driver extends Employee implements IHelp_able, ISwim_able {
    String carName;
    void drive() {
        System.out.println(name + " Водит");
    }

    @Override
    public void help() {                            // при переопределении метода интерфейса он всегда должен быть public
        System.out.println("Водитель оказывает помощь");
    }

    @Override
    public void putOutFire(String p) {
        System.out.println("Водитель тушит пожар с помощью " + p);
    }

    @Override
    public void swim() {
        System.out.println("Водитель плывёт");
    }
}

class Teacher extends Employee implements IHelp_able {
    int studentsQTY;
    void teach() {
        System.out.println(name + " Учит");
    }

    @Override
    public void help() {                            // при переопределении метода интерфейса он всегда должен быть public
        System.out.println("Учитель оказывает помощь");
    }

    @Override
    public void putOutFire(String p) {
        System.out.println("Учитель тушит пожар");
    }
}

interface IHelp_able {
    void help();                                // interface содержит только абстрактные методы, без тела
    void putOutFire(String p);                  // по умолчанию методы в интерфейсе public
    public static final int a = 10;             // в интерфейсах переменные автоматически получают модификаторы public static final
}

interface ISwim_able {
    void swim();
}

abstract class Y implements ISwim_able{}
abstract class Xx extends Y{}
class Z extends Y{
    @Override
    public void swim() {
        System.out.println("swim");
    }
}


