package Lesson26;

public class Test7 {

    public static void main(String[] args) {
        //Animal a = new Animal();
        System.out.println("----------");
        Lion l = new Lion();
    }

}


class Animal{
    Animal() {
        System.out.println("Конструктор Animal");
    }
    static {
        System.out.println("Static init Animal");
    }
    {
        System.out.println("Non static init Animal");
    }
}

class Mammal extends Animal{
    Mammal() {
        System.out.println("Конструктор Mammal");
    }
    static {
        System.out.println("Static init Mammal");
    }
    {
        System.out.println("Non static init Mammal");
    }
}

class Lion extends Mammal{
    Lion() {
        System.out.println("Конструктор Lion");
    }
    static {
        System.out.println("Static init Lion");
    }
    {
        System.out.println("Non static init Lion");
    }
}