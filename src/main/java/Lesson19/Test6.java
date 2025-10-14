package Lesson19;

public class Test6 {

    public static void main(String[] args) {
        
        int [][] array = {{3,7,8}, {4,5}, {9,4,4,6,8,3}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println();

        // те же яйца с forEach
        for (int[] item0 : array) {
            for (int item1 : item0) {

                System.out.print(item1 + " ");
            }
        }
    }
}
