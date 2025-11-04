package Lesson26;

public class Test6 {
    int a = 3;

    public Test6() {
        a = 4;
    }

    {
        a = 5;
    }
/*
    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a);
    }

 */
}

class A{
    static final int b;

    static {
        // внутри static блока можно обращаться только к статическим переменным
        b = 10;
    }
}

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    static {
        c = 5;
        d = 3;
        //e = 2;    // ошибка, т.к. константа
        //d = 4;    // аналогично
        f = 0;
    }
}

class C{
    String s = "ok";

    static int i = 0;
    static {
        System.out.println(i);
    }

    {
        i+=1;
        System.out.println(i);
    }

    {
        System.out.println(s);
    }

    C(){
        System.out.println("Конструктор");
    }

/*
    public static void main(String[] args) {
        System.out.println("privet");
        C c = new C();
    }

 */
}

class D {
    static {
        abc(2);
    }

    static void abc(int a){
        System.out.println(a + " ");
    }

    static {
        abc(4);
    }

    static {
        new D();
    }

    D() {
        abc(5);
    }

    {
        abc(6);
    }

    {
        abc(8);
    }

    public static void main(String[] args) {

    }

}