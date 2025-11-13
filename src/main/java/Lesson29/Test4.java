package Lesson29;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period period){
        LocalDate data = nachalo;
        while (data.isBefore(konec)){
            System.out.println("Наступила дата " + data + ". Пора менять дежурного");
            data = data.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2020, Month.MAY, 31);
//        Period p = Period.ofWeeks(2);
        Period p = Period.of(1,2,15);           // преиод 1 год, 2 мес, 15 дней
        smenaDejurnogo(nachalo, konec, p);
    }
}
