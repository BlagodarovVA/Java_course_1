package Lesson16;

public class Test4 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{

    public static void main(String[] args) {
        Employee emp = new Employee(5000.5, true);
        //System.out.println(emp.isManager + emp.salary); // нельзя сложить boolean и double
        System.out.println("Is he manager? " + emp.isManager + ". His salary: " +  emp.salary);
    }
}