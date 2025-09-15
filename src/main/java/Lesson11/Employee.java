package Lesson11;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double x2Number (double a) {
        return a * 2;
    }

    public double zpX2() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {

        Employee emp1 = new Employee("Valery", 5780.77);
        double d = emp1.x2Number(emp1.salary);

        System.out.println(emp1.salary);
        System.out.println(d);

        emp1.zpX2();
        System.out.println("zp после умножения - " + emp1.salary);

    }
}