package Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car (int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }


}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if(c1.engine > c2.engine) {
            if(c1.doorCount > c2.doorCount) {
                System.out.println("power and doors qty car1 is more");
            } else {
                System.out.println("power car1 is more, but doors qty car2 is more");
            }
        } else {
            System.out.println("power car2 and doors qty car2 is more");
        }
    }
}
