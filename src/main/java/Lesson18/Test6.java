package Lesson18;

import java.util.Arrays;

public class Test6 {

    public static void main(String[] args) {

        int array1[] = {1, 9, 3, -8, 0, 5, 4, 7, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 7, 1};

        System.out.println(array1 == array2);               // false - как с любыми объектами
        System.out.println(array1.equals(array2));          // false
        System.out.println(Arrays.equals(array1, array2));  // true - метод для сравнения массивов

        array1[array1.length - 1] = 10;

    }
}
