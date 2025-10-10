package Lesson17;

public class Test2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");       // с данного момента ссылаются на 1 и тот же объект
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1  = " + sb1);
        System.out.println("sb2 = " + sb2);

        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        System.out.println(sb3.equals(sb4));            // false - для стрингбилдера не работает, как для строк
    }
}
