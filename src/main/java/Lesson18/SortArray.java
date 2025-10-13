package Lesson18;

import java.util.Arrays;

public class SortArray {

    public static int[] sortArray(int [] array) {

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] sortArray2(int [] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        return array;
    }



    public static void main(String[] args) {

        int array1[] =  {1, 9, 3, -8, 0, 5, 7, -10, -11};
        sortArray(array1);

        int array2[] = {1, 9, 3, -8, 0, 5, 7, -10, -11};
        sortArray2(array2);
    }

}
