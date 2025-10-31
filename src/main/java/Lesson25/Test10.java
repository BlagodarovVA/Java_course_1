package Lesson25;

public class Test10 {

}

class Test81 implements IInterface1, IInterface2{

    @Override
    public void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test81 t = new Test81();
        ((IInterface1)t).abc();
        System.out.println(((IInterface2)t).a);
        t.abc();
    }
}

interface IInterface1{
    int a = 5;
    void abc();
}

interface IInterface2{
    int a = 10;
    void abc();
}