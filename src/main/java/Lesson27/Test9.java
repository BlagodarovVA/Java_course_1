package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) {

        try {
            File f = new File("src/test100.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Throwable e) {                                       // расположение кэтчей от дочернего к родительскому
            System.out.println("Throwable: " + e.getMessage());
        }

    }
}
