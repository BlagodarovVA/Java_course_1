package Lesson28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test13 {
    public static void main(String[] args) throws IOException {
        Animal1 a = new Mouse1();

    }
}


class Animal1{
    Animal1() throws FileNotFoundException {
    }
}

class Mouse1 extends Animal1{
    // т.к. класс наследуется, исключения также необходимо объявить
    // можно шире чем у родителя
    Mouse1() throws IOException {
        super();
    }
}

class Human{
    String name;
    int age;

    public Human(String name, int age) throws Exception {
        if(age < 0) {
            throw new Exception("nekorrektniy vozrast");
        }
        this.name = name;
        this.age = age;
    }
}