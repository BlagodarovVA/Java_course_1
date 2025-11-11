package Lesson28;

import java.util.ArrayList;

public class Test9 {

    static Doctor [] array = new Doctor[4];

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        System.out.println(list.get(3));          // IndexOutOfBoundsException

//        System.out.println(5/0);                  // ArithmeticException

        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee [] array1 = {d, t};
//        Teacher t2 = (Teacher) array1[0];           // ClassCastException

        Teacher t3 = new Teacher();
        Teacher [] array2 = {t, t3};
//        Doctor d2 = (Doctor) array2[0];             // ошибка компиляции, т.к. в array2 только объекты Teacher

//        createPwd("qwe");                           // IllegalArgumentException

        Airplan a = new Airplan();
        a.waiting();
        a.letet();
//        a.cancel();                                 // IllegalStateException

//        System.out.println(array[0].toString());    // NullPointerException

//        Integer.parseInt("44.4");                   // NumberFormatException
        Integer.parseInt("44ab", 16);               // ok - указана 16 система

    }


    public static void createPwd(String pwd){
        if(pwd.length() < 6){
            throw new IllegalArgumentException("Длина пароля менее 6 символов");
        }
        if(pwd.length() > 12){
            throw new IllegalArgumentException("Длина пароля более 12 символов");
        }
        System.out.println("Пароль задан");
    }
}






class Employee{
}
class Doctor extends Employee{
}
class Teacher extends Employee{
}

class Airplan{
    String status = "waiting";      // waiting, flies, canceled
    public void letet(){
        status = "flies";
        System.out.println("Samolet letit");
    }
    public void waiting(){
        if(status.equals("flies")) {
            throw new IllegalStateException("Samolot uzhe v vozduhe");
        }
        status = "waiting";
        System.out.println("Samolet v ojidanii poleta");
    }
    public void cancel(){
        if(status.equals("flies")) {
            throw new IllegalStateException("Samolot uzhe v vozduhe");
        }
        status = "canceled";
        System.out.println("Polet otmenen");
    }
}
