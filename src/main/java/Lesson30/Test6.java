package Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
}


class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student s){
        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
    }

    // Predicate - интерфейс встроенный в java
    void testStudents(ArrayList<Student> al, Predicate<Student> t){
        for (Student s:al){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 25, 5, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 24, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        for (Student s:list) {
            System.out.println(s.name);
        }
        System.out.println("----------");
        list.removeIf(x -> x.name.endsWith("a"));

        for (Student s:list) {
            System.out.println(s.name);
        }


//        System.out.println("----------FindStudentsOverGrade----------");
//        si.testStudents(list, (Student s) -> {return s.avgGrade > 8.5;});
//        System.out.println("----------FindStudentsUnderGrade----------");
//        si.testStudents(list, s -> s.avgGrade < 8.5);
//        System.out.println("----------FindStudentsOverAge----------");
//        si.testStudents(list, s -> {return s.age > 23;});
//        System.out.println("----------FindStudentsUnderAge----------");
//        si.testStudents(list, (Student s) -> {int a = 5; int b = 4; return s.age < 23;});
//        System.out.println("----------FindStudentsBySex----------");
//        si.testStudents(list, (Student s) -> {return s.sex == 'f';});
//        System.out.println("----------FindStudentsMixCondition----------");
//        si.testStudents(list, (Student s) -> {return ( s.avgGrade > 8 && s.age < 23 && s.sex == 'f');});
    }
}