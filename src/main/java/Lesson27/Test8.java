package Lesson27;

public class Test8 {
    static void abc(){
        System.out.println("Method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println(e);
        }
    }
}
