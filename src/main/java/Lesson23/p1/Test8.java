package Lesson23.p1;

public class Test8 {
}

class Animal1{

    static String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse1 extends Animal1{

    static String showName() {                         // метод переопределен
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }


    public static void main(String[] args) {

        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();        // если в классах метод showName сделать не static, то он переопределится при вызове методом объекта
        a.showInfoAboutMouse();
    }
}