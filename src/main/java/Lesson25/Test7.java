package Lesson25;

public class Test7 {

}

class Test100{
    int a = 5;
    void abc(){
        System.out.println("ok");
    }
}

class Test200 extends Test100{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test300 extends Test200{
    int a = 15;
    void abc(){
        //super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test300 t = new Test300();
        System.out.println(((Test100)t).a);
        ((Test100)t).abc();                 // рантайм определится тип объекта, получим ok3
    }
}