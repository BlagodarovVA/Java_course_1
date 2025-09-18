package Lesson12;

public class Test12 {

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum: " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum: " + i2);
        } else {
            System.out.println("Maximum: " + i3);
        }

    }

    void abc() {
        String str = null;      // если переменную инициализировать только в условиях, будет ошибка компиляции
        int a = 10;
        if (a >= 10) {
            str = "Hi";
        }
        if (a < 10) {
            str = "Bye";
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 700;
        if (a < 200) {
            System.out.println("a less then 200");
        } else if (a < 500) {
            System.out.println("a less than 500");
        } else {
            System.out.println("a more than 500");
        }

        Test12 t = new Test12();
        t.maximum(4, 10, 7);

        int b = 10;
        int c = 20;
        int max = (b>c) ? b : c;
        System.out.println("max: " + max);
    }
}
