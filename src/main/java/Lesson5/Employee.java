package Lesson5;

import Lesson4.Student;

public class Employee {
    Employee(int num, String familiya, int vozrast, float zp, String dep) {
        id = num;
        surname = familiya;
        age = vozrast;
        salary = zp;
        department = dep;

    }

    int id;
    String surname;
    int age;
    float salary;
    String department;

    void salaryX2() {
        salary = salary * 2;
        System.out.println("ZP " + surname + " uvelichena v 2 raza: " + salary);
    }

}

class EmployyTest {
    public static void main(String[] args) {
        Employee empl1 = new Employee(123, "Vasiliev", 28, 900, "DIT");
        Employee empl2 = new Employee(456, "Petrov", 31, 1100, "IT");

        empl1.salaryX2();
        empl2.salaryX2();

    }
}
