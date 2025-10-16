package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("S");

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();

        System.out.println(list1 == list2);                         // false - разные объекты

        System.out.println(list1.getFirst() == list2.getFirst());   // а элементы ссылаются на те же объекты
        System.out.println(list1.getLast() == list2.getLast());

        list1.getFirst().append("!!!");         // отразится в обоих листах
        list1.set(0, new StringBuilder("Z"));   // замена объекта, отразится в одном листе
        System.out.println(list2.getFirst());

        Object [] array1 = list1.toArray();
        for (Object o: array1) {
            System.out.print(o + " ");
        }
        System.out.println();

        // массиву стрингбилдер присваивается массив стрингбилдер полученный из листа
        // но элементы массива ссылаются на те же объекты, что и лист
        StringBuilder [] array2 = list1.toArray(new StringBuilder[5]);
        System.out.println(Arrays.toString(array2));

        StringBuilder [] array3 = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list3 = Arrays.asList(array3);
        System.out.println(list3);

        array3[0].append("!!!");            // изменяются элементы у всех связанных записей
        System.out.println(list3);

        array3[0] = new StringBuilder("!!!");   // заменится элемент массива и связанных записей
        System.out.println(list3);


    }
}
