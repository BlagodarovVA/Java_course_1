package Lesson5;

public class Human {
    String name;
    Car3 car;
    BancAccount bA;

    void info() {
        System.out.println("Name: " + name + " color car: " + car.color + " Balance: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("Super black", "K24");
        h.bA = new BancAccount(123, 57_300.8);

        h.info();

        h.bA.popolnenieScheta(32_000);

        h.bA.snyatieSoScheta(77_800);

    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BancAccount {
    BancAccount (int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

    void popolnenieScheta(double summa) {
        balance += summa;
        System.out.println("Schet popolnen na: " + summa);
        System.out.println("Tekuschiy balans: " + balance);
    }

    void snyatieSoScheta(double summa) {
        balance -= summa;
        System.out.println("So scheta spisano: " + summa);
        System.out.println("Tekuschiy balans: " + balance);
    }
}
