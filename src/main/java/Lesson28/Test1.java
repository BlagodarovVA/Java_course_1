package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

    static int abc() {
        int a = 5;
        try {
            File f = new File("src/test100.txt");
            FileInputStream fis = new FileInputStream(f);
            //return 0;
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            return a;
        }
        finally {
            System.out.println("finally");
            //return 1;                             // сработает этот возврат, даже если сработал в catch или try
            a = 10;
            System.out.println("finally: " + a);    // a = 10, но вернется 5 из catch - копия
        }                                           // для референс типа возвращаемое значение изменится
        return a;
    }


    public static void main(String[] args) {
        System.out.println(abc());

    }
}
