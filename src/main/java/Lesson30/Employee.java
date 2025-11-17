package Lesson30;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Employee {
    String name = "Ivan";
    String department = "IT";
    int salary = 1000;

    public Employee() {
    }

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    public void printEmployee(Employee e){
        System.out.println("Name: " + e.name);
        System.out.println("Department: " + e.department);
        System.out.println("Salary: " + e.salary);
    }

    void filterEmployees(ArrayList<Employee> al, Predicate<Employee> p){
        for (Employee e:al){
            if (p.test(e)){
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Elena", "Buh", 1300);
        Employee emp3 = new Employee("Mech", "Mech", 1600);
        Employee emp4 = new Employee("Diana", "Med", 2500);
        Employee emp5 = new Employee("Valery", "IT", 6500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        TestEmployee te = new TestEmployee();

        System.out.println("----------IT and zp > 5000----------");
        te.filterEmployees(list, (Employee e) -> {return Objects.equals(e.department, "IT") && e.salary > 5000;});
        System.out.println("----------name startsW E and salary !=450 ----------");
        te.filterEmployees(list, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("----------name = department----------");
        te.filterEmployees(list, e -> {return Objects.equals(e.name, e.department);});
    }
}
