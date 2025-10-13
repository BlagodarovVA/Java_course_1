package Lesson18;

public class Test3 {

    public static void main(String[] args) {

        // смешанные варианты создания массива

        int[] array1 = new int[7];          // декларация и аллокация
        int[] array2 = {1,2,3};             // декларация, аллокация и инициализация
        int[] array4 = new int[]{1,2,3};    // аналогично предыдущему, но длиннее

        int[] array3;                   // декларация
        array3 = new int[]{5,6,7};      // аллокация и инициализация

    }

}
