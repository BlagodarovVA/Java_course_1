package Lesson14;

public class Test3 {
    public static void main(String[] args) {

        for(int i = 2; i <=20; i+=2) {
            //System.out.println(i);
        }

        int a =15;
        if (a > 10) {
            System.out.println(a);
            a = a + 10;
        }

        for(int i = 1; i <=10; i++) {
            if (i == 4) continue;        // пропуск итерации, переход к следующей
            if (i == 8) break;          // досрочный выход из цикла
            System.out.println(i);
        }

        //for(;;) { } // минимальная реализация for. Бесконечный цикл
    }
}
