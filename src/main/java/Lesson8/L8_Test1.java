package Lesson8;

public class L8_Test1 {

    public int a = 10;
    public final int b = 100;   // константа
    public final int c;
    public static final int d = 33;     // константе static необходимо присвоить значение при создании

    L8_Test1() {

        c = 20;
    }

    L8_Test1(boolean d) {

        c = 30;
    }

    // нельзя задать значение аргумента после объявления
    public void abc (final short s) {
        
        // можно задать значение после объявления
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {

        L8_Test1 t = new L8_Test1();
        t.a = t.a * 2;
        System.out.println(t.a);
    }
}
