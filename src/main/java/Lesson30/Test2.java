package Lesson30;

import java.util.ArrayList;

public class Test2 {
}

//class Student1{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student1(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo1{
//    void printStudent(Student1 s){
//        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student1> al, StudentChecks sc){
//        for (Student1 s:al){
//            if (sc.test(s)){
//                printStudent(s);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Student1> list = new ArrayList<>();
//        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
//        Student1 st2 = new Student1("Nikolay", 'm', 25, 5, 6.4);
//        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
//        Student1 st4 = new Student1("Petr", 'm', 24, 4, 7);
//        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
//
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//
//        StudentInfo1 si = new StudentInfo1();
//
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();
//
//        System.out.println("----------FindStudentsOverGrade----------");
//        si.testStudents(list, fsog);
//        System.out.println("----------FindStudentsUnderGrade----------");
//        si.testStudents(list, fsug);
//        System.out.println("----------FindStudentsOverAge----------");
//        si.testStudents(list, fsoa);
//        System.out.println("----------FindStudentsUnderAge----------");
//        si.testStudents(list, fsua);
//        System.out.println("----------FindStudentsBySex----------");
//        si.testStudents(list, fsbs);
//        System.out.println("----------FindStudentsMixCondition----------");
//        si.testStudents(list, fsmc);
//    }
//}
//
//
//interface StudentChecks{
//    boolean test(Student1 s);
//}
//
//class FindStudentsOverGrade implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return s.avgGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return s.avgGrade < 8.5;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return s.age > 23;
//    }
//}
//
//class FindStudentsUnderAge implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return s.age < 23;
//    }
//}
//
//class FindStudentsBySex implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return s.sex == 'f';
//    }
//}
//
//class FindStudentsMixCondition implements StudentChecks{
//    @Override
//    public boolean test(Student1 s) {
//        return ( s.avgGrade > 8 && s.age < 23 && s.sex == 'f');
//    }
//}