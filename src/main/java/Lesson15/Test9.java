package Lesson15;

public class Test9 {

    public static void main(String[] args) {

        int chas = 0;

        OUTER:
        do {
            int min = 0;

            INNER:
            while (min < 60) {

                if(min == 20) continue OUTER;   // цикл будет бесконечным, т.к. час не будет увеличиваться

                //% — начало формата
                //0 — заполнять нулями
                //2 — минимальная ширина поля (2 символа)
                //d — целое число (decimal)
                String chasF = String.format("%02d", chas);
                String minF = String.format("%02d", min);
                System.out.println(chasF + ":" + minF);
                min++;
            }
            chas++;

        } while (chas < 24);

    }
}
