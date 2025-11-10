package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("src/test10.txt");
            System.out.println("file test10 exist");

            try {
                fis2.close();
            }
            catch (IOException e) {
                System.out.println("stream fis2 problem");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("file test10 not found");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
