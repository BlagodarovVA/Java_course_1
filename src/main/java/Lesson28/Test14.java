package Lesson28;

public class Test14 {
    static void abc() throws Exception {   // не ошибка, если объявление есть, а исключения быть не может
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            abc();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
