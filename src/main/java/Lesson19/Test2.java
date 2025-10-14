package Lesson19;

public class Test2 {

    // varargs - любое количество аргументов
    // в листе параметров может быть только 1 varargs
    // varargs должен стоять на последнем месте
    static void summa (String s, int ...a) {

        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
        System.out.println(s);
    }

    public void abc(int[] ... array) {  // можно при вызове ничего не передавать или массивы типа int

    }

    public static void main(String[] args) {

        summa("ok", 6,3,11);
        summa("ok 2", 6,3,11,2,0,4,8);
    }

}

