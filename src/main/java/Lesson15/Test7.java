package Lesson15;

public class Test7 {

    public static void main(String[] args) {

        int money = 100;

        do {
            System.out.println("Делйте ставку");
            System.out.println("Вы проиграли");
            System.out.println("------------------");
            money -= 10;
        } while (money > 50);

        System.out.println("money <= 50, хватит");
    }
}
