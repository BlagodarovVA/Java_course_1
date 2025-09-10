package Lesson6;

public class DZ {

    int sum(){
        return sum(0, 0, 0, 0);
    }

    int sum(int c1) {
        return sum(c1, 0, 0, 0);
    }

    int sum(int c1, int c2) {
        return sum(c1, c2, 0, 0);
    }

    int sum(int c1, int c2, int c3) {
        return sum(c1, c2, c3, 0);
    }

    int sum(int c1, int c2, int c3, int c4) {
        a1 = c1;
        a2 = c2;
        a3 = c3;
        a4 = c4;
        return a1 + a2 + a3 + a4;
    }

    int a1;
    int a2;
    int a3;
    int a4;
}

class DZTest{
    public static void main(String[] args) {

        DZ dz1 = new DZ();
        System.out.println("sum1 = " + dz1.sum());
        System.out.println("sum2 = " + dz1.sum(2));
        System.out.println("sum3 = " + dz1.sum(3, 4));
        System.out.println("sum4 = " + dz1.sum(5, 7, 9));
        System.out.println("sum5 = " + dz1.sum(5, 7, 9, 10));
    }
}
