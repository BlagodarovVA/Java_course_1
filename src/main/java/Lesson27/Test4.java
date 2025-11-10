package Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4, 8, 1};
        System.out.println("Massiv");

        try
        {
            System.out.println(array[5]);
            System.out.println("Good bye");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println(e.getClass());
        }
        finally {
            // блок выполнится независимо от того, было ли исключение
            System.out.println("finally block");
        }

        System.out.println("Код после поимки ошибки");

    }

}
