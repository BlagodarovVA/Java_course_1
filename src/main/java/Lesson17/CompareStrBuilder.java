package Lesson17;

public class CompareStrBuilder {

    public static boolean compare1(StringBuilder sb1, StringBuilder sb2) {

        if (sb1 == null || sb2 == null) {
            return sb1 == sb2;              // true только если оба null
        }

        String s1 = new String(sb1);
        String s2 = new String(sb2);

        return s1.equals(s2);
    }

    // сложнее код, но не создает доп объекты строки
    public static boolean compareChByCh(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() != sb2.length()) {
            return false;
        }
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello, bonjorno, konichiva!");
        StringBuilder sb2 = new StringBuilder("Hello, bonjorno, konichiva!");

        System.out.println("Результат сравнения значений метод 1: " + compare1(sb1, sb2));

        System.out.println("Результат сравнения значений метод 2: " + compareChByCh(sb1, sb2));
    }
}
