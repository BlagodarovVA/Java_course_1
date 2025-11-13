package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println("----------");

        LocalDate ld1 = LocalDate.of(2025,11,12);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2025, Month.NOVEMBER, 12);
        System.out.println(ld2);
        System.out.println("----------");

        LocalTime lt1 = LocalTime.of(14,45);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(14,45,34);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(14,45,34,111222333);
        System.out.println(lt3);
        System.out.println("----------");

        LocalDateTime ldt1 = LocalDateTime.of(2025,11,12,11,32);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2025,Month.NOVEMBER,12,11,32,58);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2025,11,12,11,32,58,123456789);
        System.out.println(ldt3);
        System.out.println("----------");

        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt3);    // используем существующие переменные дату и время
        System.out.println(ldt4);

        System.out.println("-----date-----");
        System.out.println("-----plusDays-----");
        ld1.plusDays(5);
        System.out.println(ld1);            // ld1 не изменится, т.к. immutable
        ld1 = ld1.plusDays(22);             // ld1 увеличится на 22 дня
        System.out.println(ld1);
        ld1 = ld1.minusDays(3);             // ld1 уменьшится на 3 дня
        System.out.println(ld1);

        System.out.println("-----plusWeeks-----");
        ld1 = ld1.plusWeeks(1);             // добавление недель
        System.out.println(ld1);
        ld1 = ld1.minusWeeks(2);            // вычитание недель
        System.out.println(ld1);

        System.out.println("-----plusMonths-----");
        ld1 = ld1.plusMonths(3);             // добавление месяцев
        System.out.println(ld1);
        ld1 = ld1.minusMonths(2);            // вычитание месяцев
        System.out.println(ld1);

        System.out.println("-----plusYears-----");
        ld1 = ld1.plusYears(2);             // добавление годов
        System.out.println(ld1);
        ld1 = ld1.minusYears(1);            // вычитание годов
        System.out.println(ld1);

        System.out.println("-----time-----");
        System.out.println(lt1);
        lt1 = lt1.plusHours(5);             // добавление часов
        lt1 = lt1.minusMinutes(15);         // вычитание минут
        lt1 = lt1.plusSeconds(40);          // добавление секунд
        lt1 = lt1.minusNanos(999);          // вычитание наносекунд
        System.out.println(lt1);

        // можно всё цепочкой
        lt1 = lt1.plusHours(5).minusMinutes(15).plusSeconds(40).minusNanos(999);
        System.out.println("chaining: " + lt1);

        System.out.println("-----date/time-----");
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(47);
        System.out.println(ldt1);
    }
}
