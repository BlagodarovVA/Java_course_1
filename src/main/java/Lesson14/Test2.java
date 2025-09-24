package Lesson14;

public class Test2 {

    public static void main(String[] args) {

        int i = 1;
        for(; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("i - " + i);

        // инициализация нескольких значений
        // составные условия
        // несколько апдейтов в апдейт экспрешене
        for(int k=0, j =5, m = 10; k<10 && k >-5; k++, j=j+10) {
            System.out.println(k);
            System.out.println(j);
            System.out.println(m);
        }

        // вызов метода в апдейт экспрешене
        for(i = 0; i < 5; i++, abc(10)) {
            System.out.println(i);
        }


    }

    static void abc(int n) {
        System.out.println(n);
    }
}
