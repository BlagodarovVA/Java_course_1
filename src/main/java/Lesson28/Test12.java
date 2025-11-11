package Lesson28;

import java.io.IOException;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Animal a = new Mouse();
        a.run();
    }
}


class Animal{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal{
    // Exception шире, чем IOException у перезаписываемого метода. Ошибка компиляции. Касается checked исключений
    // Но можно бросать любый runtime исключения
    // не касается перегруженных методов
    void run() /*throws Exception*/ {
        System.out.println("Mouse runs");
    }
}