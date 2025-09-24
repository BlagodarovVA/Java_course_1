package Lesson14;

public class Clock {

    static void time() {

        OUTER: for (int chas = 0; chas < 6; chas ++) {

            INNER1: for (int min = 0; min <= 59; min ++) {

                        if (chas > 1 && min % 10 == 0) break OUTER;

                INNER2: for (int sek = 0; sek <= 59; sek ++) {

                            if (sek * chas > min) continue INNER1;

                            System.out.println(chas + ":" + min + ":" + sek);

                }
            }
        }
    }

    public static void main(String[] args) {

        time();
    }


}
