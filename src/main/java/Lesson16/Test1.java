package Lesson16;

public class Test1 {

    public static void main(String[] args) {

        String s1 = new String("privet1privet");

        int a = s1.length();        // длина строки
        System.out.println(a);

        char c1 = s1.charAt(3);     // символ по номеру индекса (счет с 0)
        System.out.println(c1);

        int i1 = s1.indexOf('t');   // какой индекс у символа в строке
        System.out.println(i1);

        int i2 = s1.indexOf("vet");     // какой индекс у начала подстроки в строке (счет с 0)
        System.out.println(i2);         // если не найдет, вернет -1

        int i3 = s1.indexOf("p", 5);    // с какого индекса начать поиск
        System.out.println(i3);

        boolean b1 = s1.startsWith("pri");  // проверка что строка начинается с подстроки (true/false)
        System.out.println(b1);

        boolean b2 = s1.startsWith("riv", 8);  // строка начинается с подстроки на индексе
        System.out.println(b2);

        boolean b3 = s1.endsWith("ccc");  // проверка что строка заканчивается подстрокой (true/false)
        System.out.println(b3);

    }
}
