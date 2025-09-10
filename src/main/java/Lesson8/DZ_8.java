package Lesson8;

public class DZ_8 {

    static int mult3Number(int a, int b, int c) {
        return a * b * c;
    }

    static void div2Num(int a, int b) {
        System.out.println("Celaya chast: " + a / b + ". Ostatok deleniya: " + a % b);
    }

    static final double PI = 3.14;

    public void areaCircle(int radius) {
        System.out.println("---Method - areaCircle---");
        System.out.println("Rad = " + radius + ", Area of circle = " + radius * radius * PI);
    }

    public static void lengthCircle(int radius) {
        System.out.println("---Method - lengthCircle---");
        System.out.println("Rad = " + radius + ", Length of circle = " + 2 * PI * radius);
    }

    public void info(int radius) {
        System.out.println("---Method - info---");
        System.out.println("Rad = " + radius);
        areaCircle(radius);
        lengthCircle(radius);
    }

}

class DZ8_1 {
    public static void main(String[] args) {
        System.out.println("Rezult mult: " + DZ_8.mult3Number(3,4,5));
        System.out.println("Rezult mult: " + DZ_8.mult3Number(11,23,76));

        DZ_8.div2Num(9, 2);
        DZ_8.div2Num(141, 13);
        System.out.println("-------------------------");

        DZ_8 rad = new DZ_8();
        rad.areaCircle(33);

        DZ_8.lengthCircle(50);

        rad.info(9);
    }}