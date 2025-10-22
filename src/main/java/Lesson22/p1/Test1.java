package Lesson22.p1;
import Lesson22.Human;

public class Test1 {

    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName("Petr");
        h.setWeight(65.8);
        h.setAge(33);

        h.setWeight(-70);
        h.setAge(300);

        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getWeight());
    }

}
