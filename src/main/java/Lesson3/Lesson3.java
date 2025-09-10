package Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        int c = a / b;  // дробная часть не округляется, а отсекается

        //System.out.println(c);

        int a1 = 10;
        int b1 = 50;
        int c1 = 99;
        int d1 = 100;

        boolean e1 = a1 > b1 && ++c1 == d1; // не выполнится ++c1 во 2 выражении

        System.out.println(e1);
        System.out.println(c1);

        boolean e2 = a1 > b1 & ++c1 == d1;  // выполнится ++c1 во 2 выражении

        System.out.println(e2);
        System.out.println(c1);

        System.out.println(a1 & b1);    // битвайз И
        System.out.println(c1 | d1);    // битвайз ИЛИ

        boolean e3 = (a1 > b1) ^ (c1 == d1) ^ (b1 > c1);  // exclusive OR - возвращает true только если 1 элемент true

        System.out.println(e3);

        System.out.println("--------------------------");
        char ch = 'a';
        int i = 10;
        int i2 = ch;     // 97
        System.out.println(ch + i);     // 107, т.к. a - в юникоде 97
        System.out.println(i2);
    }
}
