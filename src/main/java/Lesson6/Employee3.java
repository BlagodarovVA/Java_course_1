package Lesson6;

public class Employee3 {

    Employee3(int num1, String familiya1, int vozrast1) {
        this(num1, familiya1, vozrast1, 0.0F, null);
    }

    Employee3(String familiya2, int vozrast2) {
        // более корректный способ повторного использования конструктора
        // вместо отсутствующих значений пишем значения по умолчанию для типов
        this(0,familiya2, vozrast2, 0.0F, null);
    }

    Employee3(int num3, String familiya3, int vozrast3, float zp3, String dep3) {
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

class EmployeeTest3{
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3(1, "Blagodarov", 34);
        System.out.println(emp1.surname);

        Employee3 emp2 = new Employee3("Shneider", 34);
        System.out.println(emp2.surname);

        Employee3 emp3 = new Employee3(3, "Homyak", 2, 10.74F, "kletka");
        System.out.println(emp3.surname);
    }
}
