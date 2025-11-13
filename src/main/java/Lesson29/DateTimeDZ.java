package Lesson29;

import java.time.*;
import java.time.format.*;

public class DateTimeDZ {

    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    public static void smena(LocalDateTime start, LocalDateTime end, Period p1, Duration d1){
        while (start.isBefore(end)){
            System.out.print("Работаем с: " + start.format(f1) + " ");
            start = start.plus(p1);
            System.out.println("До: " + start.format(f1));
            System.out.print("Отдыхаем с: " + start.format(f2) + " ");
            start = start.plus(d1);
            System.out.println("До: " + start.format(f2));
            System.out.println("----------");
        }
    }


    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2025, Month.MARCH, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.MARCH, 7, 17, 0);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofDays(2);

        smena(ldt1, ldt2, period, duration);
    }
}


