package Lesson23;

public class Test7 {

}

class Animal1{
    String showName() {
        return "some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse1 extends Animal1{

    String showName() {                         // метод переопределен
        return "mouse";
    }

    public static void main(String[] args) {

        Animal1 a = new Mouse1();
        a.showInfo();
    }

}
