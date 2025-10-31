package Lesson25;

public class Test1 {

    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        IHelp_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        IHelp_able h = new Teacher();
        h.help();
        //h.work();                       // ошибка, т.к. интерфейс не имеет этого метода

        emp1.work();                    // один метод работает по-разному в зависимости от типа объекта
        emp2.work();
        emp3.work();

        System.out.println("----------");
        Employee [] array4 = {emp1, emp2, emp3};

        for (Employee emp:array4) {
            emp.work();
        }

        System.out.println("----------");
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Driver);
        System.out.println(emp1 instanceof IHelp_able);
        System.out.println(emp1 instanceof Object);

    }
}


abstract class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements IHelp_able{
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements IHelp_able{
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements IHelp_able{
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface IHelp_able{
    void help();
}