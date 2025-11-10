package Lesson28;

public class Test6 {

    static String abc(){
        String s1 = "";
        String s2 = null;

        try {

            try {
                s1 += "1";
                s2.charAt(3);
                s1 += "2";
            } catch (NullPointerException e) {
                System.out.println("NullPointerException 1");
                s1 += "3";
                throw new RuntimeException();
            }
            finally {
                System.out.println("finnaly 1");
                s1 += "4";
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Exception 2");
            s1 += "5";
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
