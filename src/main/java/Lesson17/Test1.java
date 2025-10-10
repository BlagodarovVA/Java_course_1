package Lesson17;
class Car{};

public class Test1 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();            // по умолчанию первоначальная вместимость 16 символов
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);          // вместимость 50 символов
        StringBuilder sb4 = new StringBuilder(sb2);         // новый объект со значением, как у sb2

        // Есть методы, как у строк:
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("ay"));
        System.out.println(sb2.indexOf("o", 2));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));

        // добавляет в конец объекта любые данные

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);

        sb2.append(new Car());
        System.out.println(sb2);

        System.out.println(sb2.insert(4, "55"));    // вставка на конкретную позицию

        StringBuilder sb10 = new StringBuilder("Hello World");
        // sb10.delete(3, 6);                           // удаление символы по индексам с - по
        sb10.deleteCharAt(1);                           // удаление символа по позиции
        System.out.println(sb10);

        sb10.reverse();                                 // переворачивает строку
        System.out.println(sb10);

        StringBuilder sb11 = new StringBuilder("Privet vsem");
        sb11.replace(7, 11, "Vase");                    // замена в пределах индексов
        System.out.println(sb11);

        System.out.println(sb11.capacity());            // размер стрингбилдера

    }
}











