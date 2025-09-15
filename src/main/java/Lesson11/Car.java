package Lesson11;

public class Car {
    String color;
    String engine;
    int doorQty;

    public Car(String color, String engine, int doorQty) {
        this.color = color;
        this.engine = engine;
        this.doorQty = doorQty;
    }
}

class CarTest {
    void changeDoorQty(Car car, int newDoorQty) {
        car.doorQty = newDoorQty;
    }

    void rotateColors (Car car1, Car car2) {
        String varColor1 =  car1.color;
        car1.color = car2.color;
        car2.color = varColor1;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();

        Car car1 = new Car("white", "jz1", 2);
        Car car2 = new Car("black", "k24", 4);

        System.out.println("car1 doorQty: " + car1.doorQty);
        ct.changeDoorQty(car1, 3);
        System.out.println("car1 new doorQty: " + car1.doorQty);

        System.out.println("OOB colors car1, car2: " + car1.color + ", " + car2.color);
        ct.rotateColors(car1, car2);
        System.out.println("car1: color:" + car1.color + ", engine: " + car1.engine + ", doorQty: " + car1.doorQty);
        System.out.println("car2: color:" + car2.color + ", engine: " + car2.engine + ", doorQty: " + car2.doorQty);
    }

}
