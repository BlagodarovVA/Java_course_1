package Lesson19;

import java.util.Arrays;

public class Test8 {

    public static void main(String[] args) {

        int [] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = i*10;
        }

        System.out.println(Arrays.toString(array));

        for ( int b:array) {
            b = 10;             // массив не заполнится
        }
    }
}
