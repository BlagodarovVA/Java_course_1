package Lesson7;

public class Employee2 {

    int id;
    public String surname;
    int age;
    private float salary;
    String department;

    Employee2(int num1, String familiya1, int vozrast1) {
        id = num1;
        surname = familiya1;
        age = vozrast1;
    }

    public Employee2(String familiya2, int vozrast2) {
        surname = familiya2;
        age = vozrast2;
    }

    private Employee2(int num3, String familiya3, int vozrast3, float zp3, String dep3) {
        id = num3;
        surname = familiya3;
        age = vozrast3;
        salary = zp3;
        department = dep3;
    }

    public void printID() {
        System.out.println("id = " + id);
    }

    public void printSurname() {
        System.out.println("Surname = " + surname);
    }

    public void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Employee2Test{
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Blagodarov", 34);
        System.out.println(emp1.surname);

        Employee2 emp2 = new Employee2("Shneider", 34);
        System.out.println(emp2.surname);

        Employee2 emp3 = new Employee2(3, "Homyak", 2);
        emp3.printID();
        emp3.printSurname();
        emp3.printSalary();
    }
}
