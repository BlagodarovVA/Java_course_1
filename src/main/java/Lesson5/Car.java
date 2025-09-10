package Lesson5;

public class Car {
    // конструктор не имеет типа возврашаемого значения и называется как класс
    Car(String proizvoditel, String cvet, String motor, float cap) {
        manufacturer = proizvoditel;
        color = cvet;
        engine = motor;
        capacity = cap;
    }

    String manufacturer;
    String color;
    String engine;
    float capacity;
}

class CaeTest {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "black", "v4", 2.4F);

        System.out.println(car1.manufacturer);
        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println(car1.capacity);
    }
}
