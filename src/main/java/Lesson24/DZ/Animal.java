package Lesson24.DZ;

abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();

}

abstract class Fish extends Animal{

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements ISpeakable{

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak(){
        System.out.println(name + "поёт");
    }
}

abstract class Mammal extends Animal implements ISpeakable{

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

class Mechenosec extends Fish{

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim(){
        System.out.println("Меченосец - это оранжевый крась");
    }

    @Override
    void eat(){
        System.out.println("Меченосец - не хищная рыба, как и карась");
    }
}

class Pingvin extends Bird{

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть карасей");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят стоя и стаей");
    }

    @Override
    public void speak(){
        System.out.println("Пингвины не умеют петь");
    }
}

class Lion extends Mammal{

    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Лев - не самая быстрая кошка");
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищник, ест мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит, т.к. мясо - тяжёлая пища, и лев - это кот");
    }
}

class Test1{
    public static void main(String[] args) {

        Mechenosec mechenosec = new Mechenosec("Гоша");
        System.out.println("Имя - " + mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("----------");

        ISpeakable nePingvin = new Pingvin("Недопингвин");
        nePingvin.speak();
        System.out.println("----------");

        Pingvin pingvin = new Pingvin("Шкипер");
        System.out.println("Имя - " + pingvin.name);
        pingvin.fly();
        pingvin.speak();
        pingvin.eat();
        pingvin.sleep();
        System.out.println("----------");

        Animal lion = new Lion("Simba");
        System.out.println("Имя - " + lion.name);
        lion.eat();
        lion.sleep();
        System.out.println("----------");

        Mammal mammal = new Lion("Млекопитающее");
        System.out.println("Имя - " + mammal.name);
        mammal.speak();
        mammal.run();
        mammal.eat();
        mammal.sleep();

    }
}


