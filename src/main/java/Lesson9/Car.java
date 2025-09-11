package Lesson9;

public class Car {

    String color;
    String engine;
    static int count;   // static переменная - самая большая область видимости
    String model;
    double volume;

    public Car(String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
    }

    // если имя аргумента и переменной совпадает, используем this
    // this означает принадлежность к текущему объекту
    Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public void  showColor() {
        System.out.println("Цвет машины: " + color);
    }

    public void changeColor(String color3) {
        int price = 7000;
        color = color3;
        System.out.println("Цвет машины изменился на " + color);

        price += 1000;
        System.out.println("Новая цена: " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2.4);
        System.out.println(car1.model);

        Car car2 = new Car("black", "K24A");
        System.out.println(car2.engine);

        car2.showColor();
        car2.changeColor("white");

    }

}
