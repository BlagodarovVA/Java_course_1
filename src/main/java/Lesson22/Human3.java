package Lesson22;

public class Human3 {
/*
    public Human3(String n) {
        name = n;
    }
*/
    String surname;                     // дефолтный аксес модифаер позволяет видеть переменную в классах одного пакета
    protected String name = "Vasily";   // protected - элементы видны в одном пакете, а также в классах-наследниках
    protected static int salary = 150;

    protected void work() {
        System.out.println("Rabotat");
    }

    protected static void rest() {
        System.out.println("Otdihat");
    }
}
