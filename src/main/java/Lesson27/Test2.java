package Lesson27;

public class Test2 {

    // в методе может быть NullPointerException
    // можно писать вместо обработки try catch, но это не обработает ошибку
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int array [] = {1, 4, 0};
        System.out.println(array[5]);     // ArrayIndexOutOfBoundsException
        String s = null;
        System.out.println(s.length());     // NullPointerException

        System.out.println("Hello");
    }
}

