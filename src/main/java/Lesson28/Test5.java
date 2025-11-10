package Lesson28;

public class Test5 {
    void abc(){
        int [] array = {1, 2, 3};

        try {
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            String s = null;

            // только внутренний блок try/catch может поймать ошибку, которая вылетает в блоке catch
            try {
                System.out.println("catch 1: " + s.length());       // NullPointerException перекроет исключение из блока try выше
            } catch (NullPointerException ex) {
                System.out.println("NullPointerException internal");
            }
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc();
    }
}
