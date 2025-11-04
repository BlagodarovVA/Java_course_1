package Lesson26;

public class Test5 {
    {
        System.out.println("Блок инициализации 1");
    }

    Test5() {
        System.out.println("Конструктор 1");
    }

    public Test5(int a) {
        this();
        System.out.println("Конструктор 2");
    }

    // статичные блоки инициализации срабатывают 1 раз при загрузке
    static {
        System.out.println("Блок инициализации static 1");
    }

    String s1;

    // initializer блок, вызовется при каждом создании объекта класса
    // вызывается перед конструктором
    // блоков может быть несколько
    {
        s1 = "ok";
        System.out.println("Блок инициализации 2");
        int a = 5;
        //System.out.println(a);
    }

    {
        System.out.println("Блок инициализации 3");
    }

    static {
        System.out.println("Блок инициализации static 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);


    }
}
