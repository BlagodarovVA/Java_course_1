package Lesson23;


public class Test5 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        Teacher1 t1 = new Teacher1();
        //e1.sleep();
        t1.sleep();

        Employee1 e2 = new Teacher1();
        //e2.sleep();                   // ошибка, т.к. метод приватный в Employee1 и не перезаписывается

    }
}

class Food{ }
class Fruit extends Food { }

class Employee1{

    String name = "Petr";
    double salary = 1000;


    public Food eat() {
        System.out.println("Работник кушает");
        return new Food();
    }

    private void sleep() {
        System.out.println("Работник " + name + " cпит");
    }

    final void live() {                             // final - метод не может быть overridden или hidden в субклассах
        System.out.println("Работник живёт");
    }
}

class Teacher1 extends Employee1 {

    int studentsQty;

    void teach() {
        System.out.println(name + " учит");
    }

    // аннотация, что метод перезаписан
    @Override
    public Food eat() {
        System.out.println("Учитель " + name + " кушает");
        return new Food();
    }

    public void sleep() {
        System.out.println("Учитель " + name + " cпит");
    }
}


final class T{}             // такой класс нельзя наследовать
// class P extends T{};     // будет ошибка компиляции







