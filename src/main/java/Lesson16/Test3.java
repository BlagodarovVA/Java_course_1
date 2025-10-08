package Lesson16;

public class Test3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";

        System.out.println(a + b + s);  // первый + сложит числа, а второй конкатенирует, т.к. s - строка
                                        // если первый аргумент строка, то все остальные конкатенируются

    }
}
