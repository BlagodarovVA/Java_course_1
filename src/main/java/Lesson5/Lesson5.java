package Lesson5;

public class Lesson5 {

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int avg (int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class Test21 {
    public static void main(String[] args) {
        Lesson5 t = new Lesson5();
        int summa3Chisel = t.summa(1,3,5);
        System.out.println(summa3Chisel);

        System.out.println(t.avg(20, 30, 40));
    }
}
