package Lesson16;


public class Test9 {

    public static void main(String[] args) {

        String s1 = new String("Ok");
        String s2 = new String("Ok");
        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2));  // для класса String этот метод переопределен и сравнивает корректно

        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3 == s4);       // true

        String s5 = "How are You";
        String s6 = "how are you";
        System.out.println(s5.equals(s6));  // false
        System.out.println(s5.equalsIgnoreCase(s6));  // true

        String s7 = "hello ";
        System.out.println(s3 == s7.trim());    // false
    }
}
