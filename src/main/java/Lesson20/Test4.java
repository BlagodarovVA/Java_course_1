package Lesson20;

import java.util.ArrayList;

public class Test4 {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb5 = new StringBuilder("konichiva");

        list1.add(new StringBuilder("hello"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("bye"));
        list1.add(new StringBuilder("bonjorno"));
        list1.add(sb5);

        System.out.println(list1);

        System.out.println(list1.indexOf(new StringBuilder("bye")));    // -1 - не работает поиск по содержимому, т.к. разные объекты

        // проверяет, содержит ли лист объект. Как и поиск работает через equals
        System.out.println(list1.contains(sb5));

    }
}
