package Lesson14;

public class Watch {

    public void time() {

        OUTER: for (int chas = 0; chas <= 23; chas ++) {    // лейбл для лупа, чтобы можно было завершить цикл из вложенного

            INNER: for (int min = 0; min <= 59; min ++) {

                System.out.println(chas + ":" + min);

                if (min == 30) break OUTER;                 // завершение цикла по названию
            }
        }
    }

    public static void main(String[] args) {
        Watch w = new Watch();
        w.time();
    }
}
