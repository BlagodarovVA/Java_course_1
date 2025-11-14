package Lesson30;

import java.util.ArrayList;

public class Test3 {

}

// лямбда выражения работают только если в интерфейсе не более 1 метода
//interface IStudentChecks {
//    boolean test(Student s);
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student s){
//        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student> al, IStudentChecks sc){
//        for (Student s:al){
//            if (sc.test(s)){
//                printStudent(s);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Nikolay", 'm', 25, 5, 6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm', 24, 4, 7);
//        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
//
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//
//        StudentInfo si = new StudentInfo();
//
//
//        System.out.println("----------FindStudentsOverGrade----------");
//        // переопределения метод тест происходит внутри параметра
//        // лямбда выражение похоже на анонимный метод
//        // аналогично     test(Student1 s)    {return s.avgGrade > 8.5;}
//        si.testStudents(list, (Student s) -> {return s.avgGrade > 8.5;});
//
//        System.out.println("----------FindStudentsUnderGrade----------");
//        // можно писать сокращенно
//        si.testStudents(list, s -> s.avgGrade < 8.5);
//
//        // либо так - смешанный вариант
//        System.out.println("----------FindStudentsOverAge----------");
//        si.testStudents(list, s -> {return s.age > 23;});
//
//        System.out.println("----------FindStudentsUnderAge----------");
//        // если используется в правой части 2 и более стейтмента, то нужны {} скобки и return
//        si.testStudents(list, (Student s) -> {int a = 5; int b = 4; return s.age < 23;});
//
//        System.out.println("----------FindStudentsBySex----------");
//        si.testStudents(list, (Student s) -> {return s.sex == 'f';});
//        System.out.println("----------FindStudentsMixCondition----------");
//        si.testStudents(list, (Student s) -> {return ( s.avgGrade > 8 && s.age < 23 && s.sex == 'f');});
//    }
//}


