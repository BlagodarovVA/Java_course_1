package Lesson22;

public class Animal {

    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal{

    String name;
    int tail = 1;
    int paw = 4;
    Pet() {
        this.eyes = 2;
        System.out.println("I am pet");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }

}

class Dog extends Pet{

    Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{

    Cat(String name){
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }

}

class TestAnimal{
    public static void main(String[] args) {

        Dog dog = new Dog("Тузик");
        System.out.println("Лап: " + dog.paw);

        System.out.println("----------");
        Cat cat = new Cat("Барсик");
        cat.sleep();
    }
}






















