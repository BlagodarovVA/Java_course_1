package Lesson28;

public class Test3 {
    public static void main(String[] args) throws Exception {

        Exception e = null;     // но тут также получим NullPointerException
        throw e;                // нужно объявить или try/catch
    }
}
