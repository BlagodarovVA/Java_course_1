package Lesson18;

public class Test4 {

    static String s;

    public static void main(String[] args) {

        //int [] array0 = new int[-3];    // NegativeArraySizeException

        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //array[3] = 4;   // ArrayIndexOutOfBoundsException

        int [][] array2 = new int[3][];
        //System.out.println(array2[0][1]);     // NullPointerException - объект обращения пока не создан

        System.out.println(s.length());         // NullPointerException - объект обращения пока не создан
    }
}
