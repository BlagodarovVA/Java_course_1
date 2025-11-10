package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) {

        StringBuilder res = new StringBuilder("");

        try {
            File f = new File("src/test10.txt");
            System.out.println("Объект файл создан");

            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream создан");

            int counter = 0;
            while (counter<100){
                counter++;
                res.append(fis.read());
                System.out.println("информация читается...");
                if (counter == 3) {
                    fis.close();
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception 1: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Exception 2: " + e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
