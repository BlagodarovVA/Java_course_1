package Lesson24;

public class Test4 {

    IJumpable j1 = new Human();
    IJumpable j2 = new Animal();
}

class Human implements IJumpable {

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements IJumpable {
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface IJumpable {
    void jump();
}

interface A2{
    void abc();
}

interface B2 extends A2, IJumpable {      // интерфейс наследуется от нескольких интерфейсов
    void def();
}

abstract class D implements B2 {}           // абстрактный класс может имплементить интерфейс