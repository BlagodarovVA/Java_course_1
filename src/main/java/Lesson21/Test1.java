package Lesson21;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {

        int a = 4;
        // нет требования к возвращаемому типу, если нет присвоения
        System.out.println(a < 4 ? 7 : "privet");

        int b = 5;
        int c = (a > 5) ? a++ : b++;
        System.out.println(c);

    }
}
