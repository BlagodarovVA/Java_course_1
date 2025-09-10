package Lesson7;

public class Employee {

    public double salary;      // public виден всем
    private double salary1;   // private виден внутри класса
    double salary2;           // default - виден только внутри пакета
    protected double salary3;  // protected = default + виден детям родительского класса

    public void zpX2() {
        double rezult = salary * 2;
        System.out.println("Novaya zp = " + rezult);
    }
    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.zpX2();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(300);
        System.out.println(emp.salary);
        emp.zpX2();
    }
}