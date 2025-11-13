package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2025,11,12);
        LocalDate ld2 = LocalDate.of(2020,Month.MAY,5);
        System.out.println(ld1.isAfter(ld2));               // сравнение дат
        System.out.println(ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(14,45);
        LocalTime lt2 = LocalTime.of(1,5,18,333444);
        System.out.println(lt1.isAfter(lt2));               // сравнение времени
        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2015,Month.SEPTEMBER,10,17,25);
        LocalDateTime ldt2 = LocalDateTime.of(2015,Month.SEPTEMBER,10,17,25,9);
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
    }
}
