package Lesson26;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);                                    // автоконвертация int в Integer(объект) - autoboxing

        long l = 50l;

        int a = list.get(0);            // unboxing - конвертация в примитивный тип
        System.out.println(a);

        Integer b = new Integer(10);
        int c = b;                      // unboxing

        Number d = new Integer(20);     // Number - родительский тип для всех числовых типов

        String s1 = "50";
        int i1 = Integer.parseInt(s1);  // можно преобразовать строку в примитив, если у нее подходящее содержимое
        System.out.println(i1);

        String s2 = " 60";
        int i2 = Integer.parseInt(s2.trim());  // нужно делать трим пробелов, иначе получим ошибку
        System.out.println(i2);

        String s3 = "true";
        boolean b1 = Boolean.parseBoolean(s3);
        System.out.println(b1);

        Integer i3 = Integer.valueOf(10);
        String s4 = "3.14";
        Double d2 = Double.valueOf(s4);
        System.out.println(d2);

        Byte b10 = new Byte((byte) 5);
        Byte b11 = Byte.valueOf((byte) 10);
        Integer i6 = new Integer(6);
    }
}
