package Lesson11;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // при передаче в параметр метода референс типа данных, передается его копия, а не сам объект
    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("s1 - " + s1.name);
        System.out.println("s2 - " + s2.name);
    }

    // можно изменить параметры объекта, но не адрес в переменной объекта
    public static void changeName(Student s1) {
        s1.name = "Vasiliy";
    }


    public static void main(String[] args) {
        Student st1 = new Student("Alex", 2, 8.7);
        Student st2 = new Student("Petr", 1, 6.1);

        swap(st1, st2);
        System.out.println("st1 - " + st1.name);
        System.out.println("st2 - " + st2.name);

        changeName(st2);
        System.out.println("st2 - 2 - " + st2.name);
    }
}
