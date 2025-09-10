package Lesson6;

public class Overloading {
    // все 3 метода названы одинаково, но сработает нужный в зависимости от входного аргумента

    void show (int i1) {
        System.out.println(i1);
    }

    void show (boolean b1) {
        System.out.println(b1);
    }

    void show (String s1) {
        System.out.println(s1);
    }
    // можно делать одинаковые типы, но в другом порядке
    void show (String s1, int i1) {
        System.out.println("string + int");
    }

    void show (int i1, String s1) {
        System.out.println("int + string");
    }
}

class OverloadingTest {
    public static void main(String[] args) {
        Overloading mO = new Overloading();
        int a = 555;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Hello";
        mO.show(s);

    }
}
