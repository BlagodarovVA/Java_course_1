package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {

    void abc() throws FileNotFoundException{
        File f = new File("src/test10.txt");

        FileInputStream fis = new FileInputStream(f);
        //fis.read();
        System.out.println("Good bye");

    }

    void def(){
        System.out.println("hello");

        // нужна обработка, т.к. ее нет в самом методе abc
        try {
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

        System.out.println("Код после блока try catch");

        Test6 t = new Test6();
        t.def();
    }

}
