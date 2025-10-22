package Lesson22;

public class Test4 {

}

class Human4 {

    // пустой конструктор для обращения из дочернего без параметров
    Human4(){
        System.out.println("Human4 - constructor 1");
    }

    Human4(String n) {
        //name = n;
        this(n, null);  // аналогично предыдущей строке, но обращаемся с параметрами ко 2 конструктору
        System.out.println("Human4 - constructor 2");
    }

    Human4(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Human4 - constructor 3");
    }

    String name;
    String surname;

}

class Student2 extends Human4{

    // так выглядит дефолтный конструктор
    // если класс - наследник, происходит обращение к родительскому классу с помощью super
    Student2(){
        this(5);
        System.out.println("constructor 1");
    }

    Student2(String s){
        super(s);
        System.out.println("constructor 2");
    }

    Student2(int i){
        super();
        System.out.println("constructor 3");
    }


    public static void main(String[] args) {

        Student2 s1 = new Student2();           // обратится к 1 конструктору - 3 - родителю1
        System.out.println("----------");
        Student2 s2 = new Student2(555);        // обратится к 3 конструктору - родителю1
        System.out.println("----------");
        Student2 s3 = new Student2("Mihail");   // обратится к 2 конструктору - 3 - родителю2 - родителю3
    }
}
