package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2025, Month.SEPTEMBER, 1);
        LocalDateTime ldt1 = LocalDateTime.of(2026, Month.MARCH, 10, 8, 35);
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ldt1.getDayOfWeek());        // день недели
        System.out.println(ldt1.getDayOfMonth());       // день месяца
        System.out.println(ldt1.getDayOfYear());       // день года
        System.out.println(ld1.getMonth());            // название месяца
        System.out.println(ld1.getMonthValue());       // номер месяца
        System.out.println(ld1.getYear());              // год

        LocalTime lt = LocalTime.of(17,28);
        System.out.println(lt.getNano());        // для LocalTime можно получить только значения времени, без дат

        System.out.println("-----DateTimeFormatter-----");
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld1.format(d1));             // объект ld1 форматируем форматом d1

        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
        System.out.println(lt.format(d2));

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt1);
        System.out.println(ldt1.format(d3));
        // ldt1 имеет в себе и дату и время, поэтому подходят форматы d1 и d2
        System.out.println(ldt1.format(d1));
        System.out.println(ldt1.format(d2));
        System.out.println(ldt1.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println("-----ISO_WEEK_DATE-----");
        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;     // вместо месяца номер недели
        System.out.println(ld1);
        System.out.println(ld1.format(d4));

        System.out.println("-----FormatStyle-----");
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld1);
        System.out.println(ld1.format(shortDate));
        System.out.println(ldt1);
        System.out.println(ldt1.format(shortDate));

        System.out.println("-----mediumTime-----");
        DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(lt);
        System.out.println(lt.format(mediumTime));
        System.out.println(ldt1);
        System.out.println(mediumTime.format(ldt1));        // аргументы можно менять местами

        System.out.println("-----shortDateTime-----");
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt1);
        System.out.println(ldt1.format(shortDateTime));

        // свой формат
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM, yyyy года, hh:mm");
        System.out.println(ldt1);
        System.out.println(ldt1.format(f));

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy dd MM");
        LocalDate date1 = LocalDate.parse("2025 01 11", f1);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2025-11-13");    // стандартный формат, паттерн не нужен
        System.out.println(date2);
    }
}
