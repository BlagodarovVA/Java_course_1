package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("src/test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - abc");
            throw e;                                            // повторно выбрасываем исключение
        }
        finally {
            System.out.println("finally");
        }

    }

    void method(){
        try {
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - method");
        }
    }

/*
    void def() {
        try {
            int [] array = {1, 2, 3};
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            throw e;
        }
        finally {
            System.out.println("finally");
        }
    }

 */

}
