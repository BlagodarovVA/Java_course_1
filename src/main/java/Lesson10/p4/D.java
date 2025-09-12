package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;
import static Lesson10.p1.p2.B.*;



public class D {

    public static void main(String[] args) {

        System.out.println("static b - " + b1);
        System.out.println("static b - " + statStr);
        method();

        A aaa = new A();
        System.out.println("aaa.car - " + aaa.car);

        C ccc = new C();
        System.out.println("ccc.model - " + ccc.model);

        E eee = new E();
        System.out.println("eee.value - " + eee.value);
    }
}
