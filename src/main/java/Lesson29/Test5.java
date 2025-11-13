package Lesson29;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2025, Month.SEPTEMBER, 1);
        Period p = Period.ofMonths(3).ofDays(10);       // сработает только последний of, т.е. получим 10 дней
        System.out.println(nachalo.plus(p));

        System.out.println("-----duration-----");
        LocalTime lt = LocalTime.of(10,30);
        Duration d = Duration.ofMinutes(50);
        System.out.println(lt.plus(d));

        LocalDateTime ldt = LocalDateTime.of(2025, Month.SEPTEMBER, 1, 8, 35);
        System.out.println(ldt.plus(d).plus(d));
    }
}
