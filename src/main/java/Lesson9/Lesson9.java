package Lesson9;

public class Lesson9 {

    int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;  // любая длина названия
    int zzz, Vvv, $aaa, _ppp;                               // начинается с
    String _lll$lll_, xxx8xx_xx8;
    final double PI = 3.14;                                 // константы желательно называть большими буквами


    void abc(int a, int b) {                                // аргументы в разных методах невидимы друг другу
        boolean c = true;
    }

    void abcd(int a, int b) {
        boolean c = true;
    }



    String color;
    String engine;
    static int count;   // static переменная - самая большая область видимости

    Lesson9(String color, String engine) {
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    void changeColor(String color) {
        System.out.println(color);
        System.out.println("Значение переменной класса - " + this.color);
    }

    public static void main(String[] args) {
        Lesson9 car1  = new Lesson9("red", "V6");

        car1.changeColor("black");
        car1.changeColor("white");

        System.out.println(car1.color);
    }
}
