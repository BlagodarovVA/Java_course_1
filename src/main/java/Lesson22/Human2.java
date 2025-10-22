package Lesson22;

public class Human2 {
    final String gender;
    private StringBuilder name;
    private int age;
    private double weight;
    private boolean clever;

    public Human2(String gender) {
        this.gender = gender;
    }

    /*имя*/
    public StringBuilder getName() {
        // возвращаем копию объекта, а не объект для отключения возможности редактирования
        return new StringBuilder(name);
    }

    public void setName(StringBuilder s) {
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


class Test2 {
    public static void main(String[] args) {

        Human2 h = new Human2("male");
        h.setName(new StringBuilder("Petr"));

        h.getName().append("!!!");              // можно отредактировать через get!!!

        System.out.println(h.getName());
    }
}
