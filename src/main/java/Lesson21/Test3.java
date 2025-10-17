package Lesson21;

public class Test3 {

    void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {

        Test3 t = new Test3();
        char c = 'a';
        t.abc(c);                       // вместо int можно использовать char

        System.out.println('b' + 20);
    }
}
