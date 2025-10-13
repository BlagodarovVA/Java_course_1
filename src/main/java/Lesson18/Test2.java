package Lesson18;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        String [] array1;
        String array3[];    // квадратные скобки можно туда-сюда
        int []array4[];     // можно так
        int array5[][];     // или так

        int [][] array2;    // но в джаве принято так

        // способы объявления
        int [] array, a;    // объявление 2 массивов
        int b [], c;        // b - массив, c - int
        int [] d, e[][];    // 1-мерный и 3-мерный, т.к. первые скобки относятся к обоим
        int f[], g[][];     // 1-мерный и 2-мерный

        array1 = new String[3];
        array2 = new int[3][];

        // динамическая инициализация
        for (int i = 0; i<array1.length; i++) {
            array1[i] = "privet " + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];     // аллкокация 2-мерного массива одномерными разной длины
        array2[1] = new int[2];
        array2[2] = new int[7];

        // заполнение 2-мерного массива
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

                array2[i][j] = i+j;

            }
        }

        System.out.println(Arrays.deepToString(array2));

    }
}
