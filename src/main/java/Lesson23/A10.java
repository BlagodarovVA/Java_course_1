package Lesson23;

public class A10 {

    String s1 = "hello";
    static double d1 = 3.14;
    int sum(int ... i){
        int result = 0;
        for (int a:i) {
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}

class B10 extends A10{
    String s2 = super.s1 + ", friend";      // super используется для обращения к переменной родительского класа
                                            // можно не писать

    String s1 = super.s1 + ", friend";      // в таком случае super нужен

    int sum(int ... i){
        int result = super.sum(i);          // переопределение метода используя его функционал
        System.out.println("summa: " + result);
        return result;
    }


    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
    }
}
