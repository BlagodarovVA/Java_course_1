package Lesson13;

public class Month {

    public static void qtyDayMonth(int orderNumberMonth, int year) {

        if (orderNumberMonth > 0 && orderNumberMonth < 13 && year > 0) {

            boolean leapYear = (year % 4) == 0;

            switch (orderNumberMonth) {
                case 1,3,5,7,8,10,12:
                    System.out.println("В месяце 31 день");
                    break;
                case 4,6,9,11:
                    System.out.println("В месяце 30 дней");
                    break;
                case 2:
                    if (leapYear) {
                        System.out.println("В месяце 29 дней, т.к. високосный год");
                    } else {
                        System.out.println("В месяце 28 дней");
                    }
                    break;
                default:
                    System.out.println("Неправильные данные: месяц: " + orderNumberMonth + ", год: " + year);
            }
        } else {
            System.out.println("Неправильные данные: месяц: " + orderNumberMonth + ", год: " + year);
        }
    }

    public static void main(String[] args) {
        qtyDayMonth(2, -2000);

        qtyDayMonth(15, 2000);

        qtyDayMonth(2, 2000);

        qtyDayMonth(9, 2025);
    }

}
