package Lesson24;

public class Test2 {

    public static void main(String[] args) {

        Figura f1 = new Kvadrat();          // переменная абстракт класса ссылается на объект неи абстракт

        System.out.println(f1.colStoron);   // биндинг при компиляции для переменной

        f1.ploschad();                      // биндинг при выполнении для объекта
    }

}

class X{}

// abstract - объект не существует и не может быть создан
abstract class Figura extends X{        // абстрактный класс может наследоваться от конкретного
/*
    public Figura(int colStoron) {      // у абстрактного класса может быть конструктор
        this.colStoron = colStoron;
    }

*/

    int colStoron;
    abstract void perimetr();   // abstract методы не имеют тела
    abstract void ploschad();
    void showInfo() {
        System.out.println("Eto figura");
    }

}

// дочерний класс должен переписать все методы родительского абстрактного класса
// или также быть абстрактным
abstract class Pryamougolnik extends Figura{

    void def() {
        System.out.println("Eto Pryamougolnik");
    }
}

class Kvadrat extends Figura{

    int colStoron = 4;
    int stor1 = 10;

    @Override
    public void perimetr() {
        System.out.println("Perimetr Kvadrata = " + stor1 * 4);
    }

    @Override
    void ploschad() {
        System.out.println("Ploschad Kvadrata = " + stor1 * stor1);
    }
}

// класс, который перезаписывает абстрактный, называется конкретный
class Okrujnost extends Figura{
/*
    Okrujnost(int colStoron) {
        super(colStoron);
        this.colStoron = colStoron;
    }

*/

    int colStoron = 0;
    int radius = 3;
    double pi = 3.14;

    @Override
    public void perimetr() {
        System.out.println("Perimetr Okrujnosti = " + 2 * pi * radius);
    }

    @Override
    void ploschad() {
        System.out.println("Ploschad Okrujnosti = " + pi * radius * radius);
    }
}
