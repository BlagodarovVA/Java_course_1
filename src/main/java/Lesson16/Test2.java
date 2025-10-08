package Lesson16;

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("0123456789012345");

        String s10 = s1.substring(6);   // кусок строки с 6 индекса до конца
        System.out.println(s10);

        String s11 = s1.substring(3, 7);   // кусок строки с 3 по 7 не включая 7
        System.out.println(s11);

        String s12 = " rte wui pwef       ";
        s12 = s12.trim();               // убирает пробелы по краям строки
        System.out.println(s12);

        String s13 = new String("privet medved");

        String s14 = s13.replace('d', 'y');     // замена символов или подстрок в строке
        System.out.println(s14);

        String s15 = s13.replace("medved", "zaic");
        System.out.println(s15);

        String s16 = "preved ";
        String s17 = "medved";

        System.out.println(s16.concat(s17));    // конкатенация

        String s18 = "PrIvEt:2";
        System.out.println(s18.toLowerCase());  // к нижнему регистру

        System.out.println(s18.toUpperCase());  // к верхнему регистру

        boolean b = s18.contains(":2");         // проверка, что строка содержит подстроку
        System.out.println(b);


    }
}
