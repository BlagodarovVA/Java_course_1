package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test12 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("src/test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            throw e;                            // повторно выбрасываем исключение
        }
        finally {
            System.out.println("finally");
        }

    }
}
