package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    void abc() throws FileNotFoundException {
        File f = new File("src/test100.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Good bye");
    }

    void def() throws FileNotFoundException {
        System.out.println("hello");
        abc();
    }


    public static void main(String[] args) {

        Test7 t = new Test7();

        try {
            t.def();
        }
        catch (IOException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("----------");
            e.printStackTrace();
        }
    }
}
