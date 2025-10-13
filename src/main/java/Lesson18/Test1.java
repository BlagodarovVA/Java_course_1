package Lesson18;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        // декларация
        int [] array1;
        String [] array2;
        double [][] array3;
        int [][] array4;
        double [] array7;

        // аллокация
        array1 = new int[8];        // указание размера
        array2 = new String[3];
        array3 = new double[4][2];  // 4 одномерных массива с длиной 2 каждый
        array4 = new int[3][];      // вторая цифра не заполняется, если разная длина одномерных массивов
        array7 = new double[2];

        System.out.println(array2.length);  // длина 3, хотя массив пустой

        // статическая инициализация
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array7 = array5;            // сейчас они ссылаются на один объект

        array3[1] = array5;         // сейчас они ссылаются на один объект


        System.out.println(Arrays.toString(array5));
        array7[0] = 1;
        System.out.println(Arrays.toString(array5));


    }

}
