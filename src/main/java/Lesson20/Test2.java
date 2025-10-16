package Lesson20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");

        list.add(1, "privet");        // добавление на указанную позицию, остальное сместится

        for (String s:list) {
            System.out.print(s + " ");
        }

        // у каждого примитивного типа данных есть wrapper класс референс типа
        ArrayList <Integer> list1 = new ArrayList<>();      // Integer - объект

        System.out.println();
        System.out.println(list.get(3));                    // получение элемента по индексу

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.set(1, "Halo");                         // set - замена элемента по индексу
        System.out.println(list);

        list.remove("poka");                         // для строк работает удаление по содержанию
        System.out.println(list);


        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");

        list.addAll(list2);                         // добавление в конец всех значений второго листа
        System.out.println(list);

        list.addAll(1, list2);                      // добавление с индекса всех значений второго листа
        System.out.println(list);

        list2.set(1, "Ivanov");                     // изменение элемента добавленного листа не повлечет изменений в другом листе
        System.out.println(list);
        System.out.println(list2);
    }
}
