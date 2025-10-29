package Lesson24;

public class Test1 {
/*
    public final static void main(String[] args) {      // final не позволит в сабклассах переопределять или хайдить этот метод
        System.out.println("final main");
    }
*/

}

class A{
    String s = "privet";

    void abc() {
        System.out.println("A ???");
    }
}

class B extends A{
    String s = "poka";

    void abc() {
        System.out.println("B !!!");
    }
}

class C extends B{

    public static void main(String[] args) {
        C c = new C();
        c.abc();

        System.out.println(c.s);
    }
}