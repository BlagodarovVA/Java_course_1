package Lesson18;

import java.util.Arrays;

public class ShowArray {

    public static void showArray ( String [][] array) {
        StringBuilder sb = new StringBuilder("{ ");

        for (int i = 0; i < array.length; i++) {

            sb.append("{");
            for (int j = 0; j < array[i].length; j++) {

                sb.append(array[i][j]);

                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }

            sb.append("}");
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");

        System.out.println(sb);
    }


    public static void showArray2( String [][] array) {
        String s1 = Arrays.deepToString(array);
        s1 = s1.replaceAll("\\[", "{");
        s1 = s1.replaceAll("]", "}");
        s1 = s1.replaceAll("\\{\\{", "{ {");
        s1 = s1.replaceAll("}}", "} }");
        System.out.println(s1);
    }

    public static void main(String[] args) {

        String array1[][] =  {{"Элем00", "Элем01"}, {"Элем10"}, {"Элем20", "Элем21", "Элем22"}, {"Элем30", "Элем31"}};
        showArray(array1);

        showArray2(array1);
    }
}
