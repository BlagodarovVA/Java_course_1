package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("black", "K24A");
        Car c2 = new Car("black", "K24A");
        Car c3 = new Car("red", "v3");
        System.out.println(c1.equals(c2));      // если метод не перезаписан, вернет false

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("red", "v3");
        System.out.println(list.contains(c4));  // если метод не перезаписан, вернет false

        Car c5 = null;
        //System.out.println(c5.equals(c4));  // ошибка, нельзя вызывать методы на null

        System.out.println(c1.toString());
        System.out.println(list);               // использует переопределенный метод toString
    }

}

class Car{
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Car) {
            Car car = (Car) obj;
            return (color.equals(car.color) && engine.equals(car.engine));
        }
        return false;
    }

    public String toString(){
        return "Машина с мотором " + engine + ", цвета " + color;
    }
}