package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();       // ArrayList может содержать только объекты, без примитивов
        list.add("privet");

        Car c = new Car();
        list.add(c);

        Student s = new Student();
        list.add(s);

        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<String>();      // с указанием типа объявляется так
        list2.add("poka");

        ArrayList<String> list3 = new ArrayList<>();            // и так

        ArrayList <StringBuilder> list4 = new ArrayList<>(30);      // можно указать размер, но при необходимости он автоматом увеличится
        ArrayList <StringBuilder> list6 = new ArrayList<>(list4);   // будет создан аналогичный 4 листу лист, но это новый объект

        List <StringBuilder> list5 = new ArrayList<>();         // List - родительский тип арэйлиста
        list5.add(new StringBuilder("ok"));

    }
}


class Car{}
class Student{}