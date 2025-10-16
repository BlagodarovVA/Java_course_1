package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test7 {
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        ArrayList<String> list2 = list1;

        System.out.println(list1);
        Collections.sort(list1);        // сортировка листа
        System.out.println(list1);

        System.out.println(list1.equals(list2));    // true - сравнение листов. Порядок элементов важен

        // итератор, чтобы проходить по элементам листа
        // ListIterator - метод listIterator
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            //it.next()
            it.remove();                        // удаление элемента, идет в паре с it.next()
        }
        System.out.println(list1);
    }
}
