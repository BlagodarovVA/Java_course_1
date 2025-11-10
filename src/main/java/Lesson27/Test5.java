package Lesson27;

import java.io.*;

public class Test5 {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/test10.txt");

        try
        {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("Good bye");
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // catch блоков может быть несколько разного типа
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        // блок выполнится независимо от того, было ли исключение
        finally {
            System.out.println("finally block");
        }

        System.out.println("Код после блока try catch");

    }

}
