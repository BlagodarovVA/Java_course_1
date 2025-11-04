package Lesson26;

public class Test4 {

    static void abc(String s){
        System.out.println("A");
    }
    static void abc(String ... s){
        System.out.println("B");
    }
    static void abc(Object s){
        System.out.println("C");
    }
    static void abc(String s1, String s2){
        System.out.println("D");
    }


    static void def(Long a){
        System.out.println("E");
    }
    static void def(Long ... a){
        System.out.println("F");
    }
    static void def(long a){
        System.out.println("G");
    }
    static void def(Object a){
        System.out.println("H");
    }
    static void def(Integer a){
        System.out.println("I");
    }


    public static void main(String[] args) {
        abc("ok");
        abc("ok", "!!!");
        abc("ok", "Hi", "Bye");

        def(50l);       // порядок: G, E, H, F
        def(100);       // порядок: G, I, H
    }
}
