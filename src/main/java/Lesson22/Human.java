package Lesson22;

public class Human {
    final String gender;
    private String name;
    private int age;
    private double weight;
    private boolean clever;

    public Human(String gender) {
        this.gender = gender;
    }
    // инкапсуляция закрывает доступ к переменным и делает отдельные методы для него
    // в методах настраиваются требования к валидности данных или другие проверки

    /*имя*/
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }

    /*возраст*/
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if(i > 0 && i < 150) {
            age = i;
        } else {
            System.out.println("Введите корректный возраст!");
        }
    }

    /*вес*/
    public double getWeight() {
        return weight;
    }
    public void setWeight(double w) {
        if (w > 1 && w < 300) {
            weight = w;
        } else {
            System.out.println("Введите корректный вес!");
        }
    }

    public boolean isClever() {
        return  clever;
    }

}

class Test {
    public static void main(String[] args) {

        Human h = new Human("male");
        h.setName("Petr");
        h.setWeight(65.8);
        h.setAge(70);

        h.setWeight(-70);
        h.setAge(300);

        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getWeight());




    }
}
