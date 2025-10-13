package Lesson18;

import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        int array1[] = {1, 9, 3, -8, 0, 5, 4, 7, 1};

        System.out.println(Arrays.toString(array1));

        Arrays.sort(array1);                            // сортировка массива
        System.out.println(Arrays.toString(array1));

        int index1 = Arrays.binarySearch(array1, 5);   // корректно работает для отсортированного массива
        int index2 = Arrays.binarySearch(array1, 100);  // если элемент не найден, вернет отрицательный индекс
        System.out.println(index1);


    }

}
