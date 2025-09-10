package Lesson8;

public class Student8 {
    String name;
    int course;
    static int count;   // переменная принадлежит классу, а не объекту
    int a;


    public Student8 (String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student № " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov - " + count);
    }

    public  void showInfo() {
        System.out.println("Welcome to the student class!");
    }

    // metod пренадлежит объекту
    void abc() {
        a++;
    }

    // metod пренадлежит классу
    static void abcd() {    // внутри статичного метода можно использовать статичные переменные
        count++;

        Student8 st2 = new Student8("Petr", 5);
        st2.a++;            // в таком случае можно использовать переменную не static
    }

    public static void main(String[] args) {
        abcd();

        Student8 st3 = new Student8("Ivan", 4);
        st3.abc();

    }
}


class Student8Test{
    public static void main(String[] args) {
        Student8 st1 = new Student8("Valery", 1);
        Student8 st2 = new Student8("Diana", 2);
        Student8 st3 = new Student8("Homyak", 3);

        System.out.println(st1.count);      // так себе вариант, лучше использовать следующий
        System.out.println(Student8.count);

        Student8.showCount();
    }
}
