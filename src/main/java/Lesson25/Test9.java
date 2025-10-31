package Lesson25;

public class Test9 {

    // варианты объявления переменных
    int a, b = 3, c, d = b + 5;         // компилятор знает, что b = 3 и подставляет в d
    int a2, b2 = 3, c2, d2 = a2 + 5;    // a2 не задано значение, по умолчанию 0

    public static void main(String[] args) {
        Test9 t = new Test9();
        System.out.println(t.d);
        System.out.println(t.d2);
    }
}
