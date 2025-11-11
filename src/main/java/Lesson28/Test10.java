package Lesson28;

public class Test10 {
//    static {
//        int a = Integer.parseInt("12e");        // ExceptionInInitializerError
//    }

//    static String s = null;
//    static int a = s.length();                  // ExceptionInInitializerError

    static String s = abc();
    static String abc(){
        String [] array = {"1", "2", "3"};
        return array[100];                      // ExceptionInInitializerError
    }

    public static void main(String[] args) {

    }
}
