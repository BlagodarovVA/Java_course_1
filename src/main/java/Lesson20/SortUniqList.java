package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class SortUniqList {

    public static ArrayList<String> abc(String ...params) {
        ArrayList<String> list = new ArrayList<>();

        for (String i:params) {             // заполняем уникальными значениями
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        Collections.sort(list);             // сортируем
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("hello", "bye", "123", "qwe", "hello", "bye", "qwe", "qwe");
    }
}
