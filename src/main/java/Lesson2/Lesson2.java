package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        long num = 1_000_000L;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20;
        float f4 = 20.0F;

        double d1 = 5.5D;
        double d2 = 87.65d;
        double d3 = 87.65;

        char c1 = 800; // 800 символ в юникоде в 10 системе
        char c2 = '\u04BC'; // в 16 системе

        System.out.println(c1);
        System.out.println(c2);

        int a10 = 60;
        int a2 = 0B111100;
        int a22 = 0b111100;

        System.out.println("2 система - " + a22);

        int a8 = 074;   // нет ошибки
        int a81 = 0_74;

        System.out.println("8 система - " + a8);

        int a16 = 0x3C;
        int a17 = 0X3C;


        System.out.println("16 система - " + a16);


    }
}
