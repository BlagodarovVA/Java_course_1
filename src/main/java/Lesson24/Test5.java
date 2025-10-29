package Lesson24;

public class Test5 {
}

interface I1{
    void abc();
    default void def(){                     // default метод в интерфейсе всегда имеет тело
        System.out.println("default Method def");   // его можно не переопределять в классе
    }
    default void ghi(){                     // default методов может быть много
        System.out.println("default Method ghi");
    }

    static void statMethod(){
        System.out.println("static method 1");
    }
}

interface I2 extends I1{
    void abc();             // переопределение дефолтного метода на абстрактный
}

interface I3{
    static void statMethod(){
        System.out.println("static method 2");
    }
}

class R implements I1, I3{
    @Override
    public void abc() {}

    public static void main(String[] args) {
                            // статический метод не наследуется из интерфейса
        I1.statMethod();    // обращение только через интерфейс, даже если он не имплементируется
        I3.statMethod();    // нет конфликта, т.к. обращеие только через интерфейс
    }
}

class S {
    R method1(){
        return new R();
    }
    I1 method2(){
        return new R();
    }
}


class Z2 implements I1{
    @Override
    public void abc() {
        System.out.println("Method abc");
    }

    @Override
    public void def() {
        System.out.println("Override default Method def");
    }
/*
    public static void main(String[] args) {

        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
    }
*/
}