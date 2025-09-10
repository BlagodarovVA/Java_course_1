package Lesson6;

public class Employee2 {

    Employee2(int num1, String familiya1, int vozrast1) {
        // нельзя вызвать по имени класса overloaded конструктор в конструкторе, поэтому this
        this(familiya1, vozrast1);
        id = num1;

    }
    // можно создавать несколько конструкторов с одинаковыми именами, но разными параметрами
    Employee2(String familiya2, int vozrast2) {
        surname = familiya2;
        age = vozrast2;
    }

    Employee2(int num3, String familiya3, int vozrast3, float zp3, String dep3) {
        // this должен идти 1 строкой внутри конструктора
        this(num3, familiya3, vozrast3);
        salary = zp3;
        department = dep3;

    }

    int id;
    String surname;
    int age;
    float salary;
    String department;
}

class EmployeeTest2{
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Blagodarov", 34);
        System.out.println(emp1.surname);

        Employee2 emp2 = new Employee2("Shneider", 34);
        System.out.println(emp2.surname);

        Employee2 emp3 = new Employee2(3, "Homyak", 2, 10.74F, "kletka");
        System.out.println(emp3.surname);
    }
}
