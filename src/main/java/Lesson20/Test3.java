package Lesson20;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");
        StringBuilder sb4 = new StringBuilder("bonjorno");
        StringBuilder sb5 = new StringBuilder("konichiva");

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        list1.add(sb4);
        list1.add(sb5);

        for (int i = 0; i < list1.size(); i++) {
            list1.get(i).append("!!!");             // изменение значений листа
        }
        System.out.println(list1);

        StringBuilder del1 = list1.remove(3);        // удаление элемента по индексу
        System.out.println(del1);                    // метод возвращает удаленный элемент
        System.out.println(list1);

        boolean del2 = list1.remove(sb1);           // Удаление элемента по объекту, т.е. когда адреса совпали
        System.out.println(del2);
        System.out.println(list1);                  // метод возвращает результат удаления

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list1.addAll(list2);
        System.out.println(list1);

        list2.get(1).append("O_o");                 // Изменения отразятся и в 1 листе, т.к. объект не заменен, а изменен

        System.out.println(list2);
        System.out.println(list1);

        list2.clear();                              // Очистка листа. Возвращает void
        System.out.println(list2);

    }
}
