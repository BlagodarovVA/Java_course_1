package Lesson4;

import java.text.DecimalFormat;

public class Student {
    Student(int id, String imya, String familiya, int god, float rateMath, float rateEcon, float rateEng){
        studentId = id;
        name = imya;
        surname = familiya;
        year = god;
        avgRateMath = rateMath;
        avgRateEconomics = rateEcon;
        avgRateEng = rateEng;
    }
    Student(int id, String imya, String familiya, int god){
        this(id, imya, familiya, god, 0, 0, 0);
    }

    // не нужно проставлять значению по умолчанию, проставятся сами
    Student(){
    }

    int studentId;
    String name;
    String surname;
    int year;
    float avgRateMath;
    float avgRateEconomics;
    float avgRateEng;

}

class StudentTest {

    void avgRate(Student st) {
        // делаем формат 2 знака после запятой
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("avg Rate " + st.name + " " + st.surname + " = " + df.format((st.avgRateMath + st.avgRateEconomics + st.avgRateEng)/3));
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 555444;
        student1.name = "Fedor";
        student1.surname = "Sumkin";
        student1.year = 2015;
        student1.avgRateMath = 7.4F;
        student1.avgRateEconomics = 5.9F;
        student1.avgRateEng = 8.3F;

        Student student2 = new Student();
        student2.studentId = 222333;
        student2.name = "Ivan";
        student2.surname = "Bolvan";
        student2.year = 2014;
        student2.avgRateMath = 5.1F;
        student2.avgRateEconomics = 7.9F;
        student2.avgRateEng = 4.6F;

        Student student3 = new Student();
        student3.studentId = 666777;
        student3.name = "Stepan";
        student3.surname = "Belous";
        student3.year = 2005;
        student3.avgRateMath = 8.2F;
        student3.avgRateEconomics = 7.7F;
        student3.avgRateEng = 6.5F;

        // без этой строки метод не сработает, т.к. он находится в классе StudentTest
        StudentTest sTest = new StudentTest();
        sTest.avgRate(student1);
        sTest.avgRate(student2);
        sTest.avgRate(student3);

        // ---------------------------------DZ_6--------------------------------------

        Student student4 = new Student();
        System.out.println("student4.studentId - " + student4.studentId);

        Student student5 = new Student(661177, "Zidan", "Zinedin", 1975);
        student3.avgRateMath = 7.2F;
        student3.avgRateEconomics = 6.7F;
        student3.avgRateEng = 5.5F;
        System.out.println("student5.studentId - " + student5.studentId);


    }
}