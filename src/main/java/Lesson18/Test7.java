package Lesson18;

public class Test7 {

    public static void maxMin(double [] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("min: " + min + ", max: " + max);
    }


    public static void main(String[] args) {

        double array1[] = {1.05, 9.20, 3.14, -8.29, 0, 5.27, 9.21};
        maxMin(array1);

        maxMin(new double[] {2.5, -4, 3});
    }
}
