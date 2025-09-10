package Lesson6;

public class Employee {

    public Employee(int num1, String familiya1, int vozrast1) {
        id = num1;
        surname = familiya1;
        age = vozrast1;
    }
    // можно создавать несколько конструкторов с одинаковыми именами, но разными параметрами
    Employee(String familiya2, int vozrast2) {
        surname = familiya2;
        age = vozrast2;
    }

    Employee(int num3, String familiya3, int vozrast3, float zp3, String dep3) {
        id = num3;
        surname = familiya3;
        age = vozrast3;
        salary = zp3;
        department = dep3;

    }

    int id;
    String surname;
    int age;
    float salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Blagodarov", 34);
        System.out.println(emp1.surname);

        Employee emp2 = new Employee("Shneider", 34);
        System.out.println(emp2.surname);

        Employee emp3 = new Employee(3, "Homyak", 2, 10.74F, "kletka");
        System.out.println(emp3.surname);
    }
}
