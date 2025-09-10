package Lesson8;

public class Car {
    String color = "black";
    String engine = "K24A";
}

class Human {
    String name = "Valery";
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.engine = "v8";
    }
}