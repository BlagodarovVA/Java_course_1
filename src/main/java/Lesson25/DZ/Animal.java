package Lesson25.DZ;

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
        System.out.println("Не очень интересно наблюдать, как клюёт карась, другое дело карп...");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements ISpeakable {

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

        Animal aLion = new Lion("Simba");
        Animal aPingvin = new Pingvin("Animal пингвин");
        Animal aMechenosec = new Mechenosec("Animal меченосец");
        Fish fish = new Mechenosec("Fish меченосец");
        Bird bird = new Pingvin("Воробей");
        Mammal mammal = new Lion("Млекопитающее");
        Mechenosec mechenosec = new Mechenosec("Гоша");
        Pingvin pingvin = new Pingvin("Шкипер");
        Lion lion = new Lion("Муфаса");
        ISpeakable nePingvin = new Pingvin("Недопингвин");
        ISpeakable neLev = new Lion("Недолев");


        System.out.println("--------------------");
        System.out.println("--------------------");

        Animal [] animals = {aLion, aPingvin, aMechenosec, fish, bird, mammal, mechenosec, pingvin, lion};
        ISpeakable [] iSpeakable = {bird, mammal, pingvin, lion, nePingvin, neLev};


        for (ISpeakable item:iSpeakable){
            switch (item){
                case Pingvin p -> {
                    System.out.println("Pingvin - " + p.name);
                    p.fly();
                    p.speak();
                    p.eat();
                    p.sleep();
                    System.out.println("----------");
                }

                case Lion l -> {
                    System.out.println("Lion - " + l.name);
                    l.speak();
                    l.run();
                    l.eat();
                    l.sleep();
                    System.out.println("----------");
                }

                case ISpeakable i -> {
                    System.out.println("ISpeakable");
                    i.speak();
                    System.out.println("----------");

                }
            }
        }

        System.out.println("--------------------");
        System.out.println("--------------------");

        for (Animal item:animals){
            switch (item){
                case Pingvin p -> {
                    System.out.println("Pingvin - " + p.name);
                    p.fly();
                    p.speak();
                    p.eat();
                    p.sleep();
                    System.out.println("----------");
                }

                case Lion l -> {
                    System.out.println("Lion - " + l.name);
                    l.speak();
                    l.run();
                    l.eat();
                    l.sleep();
                    System.out.println("----------");
                }

                case Mechenosec m -> {
                    System.out.println("Mechenosec - " + m.name);
                    m.eat();
                    m.swim();
                    m.sleep();
                    System.out.println("----------");
                }

                case Animal a -> {
                    System.out.println("Animal - " + a.name);
                    a.eat();
                    a.sleep();
                    System.out.println("----------");
                }

            }
        }
    }
}


