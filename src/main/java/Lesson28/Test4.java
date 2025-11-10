package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {

    FileInputStream fis1, fis2;
    public void abc(){
        try {
            fis1 = new FileInputStream("src/test9.txt");


            try {
                fis2 = new FileInputStream("src/test10.txt");
            }
            catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException - test10");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - test9");
        }
        finally {
            System.out.println("external finally");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("IOException - finally");
            }
        }
    }

    public static void main(String[] args) {

        Test4 t = new Test4();
        t.abc();

    }
}
