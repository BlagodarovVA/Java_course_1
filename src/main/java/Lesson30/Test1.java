package Lesson30;

import java.util.ArrayList;

public class Test1 {

}

class Student{
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

class StudentInfo{
    void printStudent(Student s){
        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> al, double avgGrade){
        for (Student s:al){
            if(s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade){
        for (Student s:al){
            if(s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> al, int age){
        for (Student s:al){
            if(s.age > age){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> al, int age){
        for (Student s:al){
            if(s.age < age){
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> al, char sex){
        for (Student s:al){
            if(s.sex == sex){
                printStudent(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, double avgGrade, int age, char sex){
        for (Student s:al){
            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex){
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

        si.printStudentsOverGrade(list, 8.5);
        System.out.println("----------------------------------------");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("----------------------------------------");
        si.printStudentsOverAge(list, 23);
        System.out.println("----------------------------------------");
        si.printStudentsUnderAge(list, 23);
        System.out.println("----------------------------------------");
        si.printStudentsBySex(list, 'f');
        System.out.println("----------------------------------------");
        si.printStudentsMixCondition(list, 8, 23, 'm');
        System.out.println("----------------------------------------");
    }
}