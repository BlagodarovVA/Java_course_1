package Lesson25;

public class Test8 {
    public static void main(String[] args) {

        System.out.println("Widening:");
        byte b = 10;
        int a = b;

        System.out.println("Narrowing:");
        byte b2 = 3;
        short s1 = -6;
        char c1 = 100;

        int i1 = 8;
        short s2 = (short) i1;              // кастинг

        final int i2 = 10;                  // для констант final кастинг не нужен
        short s3 = i2;

        char c3 = (char) -8;                // какстинг в таком случае утратит данные и некорректно передаст число
        System.out.println(c3);             // т.к. char не содержит отрицательных чисел
        int i3 = c3;
        System.out.println(i3);

        int i4 = 5;
        long l4 = 10;
        System.out.println(i4+l4);           // меньший будет приведен к большему типу int->long, затем сложение

        i4 = (int)(i4*l4);                   // приведение большего к меньшему

        float f5 = 3.14f;
        int i5 = 10;
        System.out.println(f5 + i5);         // приведение int к float

        byte b6 = 3;
        short s6 =4;
        char c6 = 5;
        System.out.println(b6 + s6 + c6);   // эти 3 типа приводятся к int перед операцией, даже если int не присутствует
        System.out.println(++b6);           // кроме унарных операций

        byte  b7 = 10;
        float f7 = 7;
        double d7 = 2.4;
        double rez7 = b7 + f7 + d7;         // Результат будет double, т.к. он наибольший из типов в выражении
        System.out.println(rez7);

        double d8 = 3.14;
        float f8 = 6.28f;
        double rez8 = d8 + f8;              // результат приводится к большему типу

    }
}




