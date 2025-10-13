package Lesson18;

public class Test8 {

    public static void main(String[] args) {

        char [] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);           // массив преобразуется в строку
        System.out.println(s);

        StringBuilder sb1 = new StringBuilder("Hello World");
        sb1.append(array, 2, 3);                 // добавление в конец символов из массива с индекса и количество элементов
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(2, array, 1, 3);             // вставка в sb с индекса (параметр 1)
        System.out.println(sb2);
    }
}
