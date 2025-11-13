package Lesson29;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.createCar();            // Если у класса приватный конструктор
    }
}

class Car{
    private Car(){}
    static Car createCar(){
        return new Car();
    }
}