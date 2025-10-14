package Lesson19;

import java.util.Arrays;

public class DZ {

    public static void abc(String[] ...s) {

        String [][] inputArr = new String[][]{{"asass", "lllssss", "werwer"},{"owtew"},{"213421", "45463", "lllssss", "87697689"}};

        // считаем элементы аргументов массивов
        int length = 0;
        for (String[] i:inputArr) {
            length += i.length;
        }

        String [] rez = new String[length];
        int c = 0;

        // Заполняем новый массив
        for (String[] item:inputArr) {
            for (String item2: item) {

                boolean contains = false;

                for(String[] a:s) {
                    for (String b:a) {

                        if (b.equals(item2)) {
                            contains = true;
                            break;
                        }
                    }
                }

                rez[c] = contains ? null : item2;
                c++;
            }
        }

        System.out.println(Arrays.toString(rez));

    }

    public static void main(String[] args) {

        // из консоли
        // abc(args);

        // компилировать из вышестоящей папки
        // javac Lesson19/DZ.java
        // java Lesson19.DZ owtew 213421 lllssss

        // из IDE
        abc(new String[]{"owtew", "lllssss"}, new String[]{"213421"});


    }
}
