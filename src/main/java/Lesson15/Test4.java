package Lesson15;

public class Test4 {
    public static void main(String[] args) {

        int a = 5;
        while (++a > 10) {  // если с 1 итерации условие false, то в тело цикла луп ни разу не зайдет
            a++;

        }
        System.out.println(a);

    }
}
