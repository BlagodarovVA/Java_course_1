package Lesson19;

import java.util.Arrays;

public class Test7 {

    public static void main(String[] args) {

        int [] array = {0,6,4,1};

        for (int j : array) {
            j = 3;              // изменение переменной не меняет элементы массива ПРИМИТИВНОГО типа данных
        }
        System.out.println(Arrays.toString(array));

        String [] array2 = {"privet", "poka", "ok"};

        for (String s:array2){
            s = new String("hello");                // значения не изменятся
        }

        System.out.println(Arrays.toString(array2));


        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");

        StringBuilder [] array3 = {sb1, sb2, sb3};

        for (StringBuilder sb:array3) {
            //sb = new StringBuilder("hello");        // значения не изменятся
            sb.append("Java");                        // значения ИЗМЕНЯТСЯ
        }

        System.out.println(Arrays.toString(array3));



    }
}
