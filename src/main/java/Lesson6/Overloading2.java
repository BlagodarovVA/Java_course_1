package Lesson6;

public class Overloading2 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum (String s1, String s2) {
        return s1 + s2;
    }
}

class Overloading2Test {
    public static void main(String[] args) {
        Overloading2 mO2 = new Overloading2();

        int a = mO2.sum(7, 8);
        System.out.println(a);

        String s = mO2.sum("bon", "jorno");
        System.out.println(s);
    }
}