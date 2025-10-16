package Lesson20;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("hello");
        list1.add("ok");
        list1.add("bye");
        list1.add("bonjorno");
        list1.add("Kontsevich");
        list1.add("bye");
        System.out.println(list1);

        // 2 - для строк работает поиск по содержимому, находит первый совпавший элемент
        System.out.println(list1.indexOf("bye"));

        // 5 - находит последний совпавший элемент
        System.out.println(list1.lastIndexOf("bye"));

        System.out.println(list1.size());       // размер листа

        System.out.println(list1.isEmpty());    // проверяет, что пустой - true/false

        // проверяет, содержит ли лист объект. Как и поиск работает через equals
        System.out.println(list1.contains("bonjorno"));




    }
}
