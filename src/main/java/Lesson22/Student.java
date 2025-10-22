package Lesson22;

public class Student {

    private StringBuilder name;
    private int course = 1;
    private double grade = 1;

    /*имя*/
    public StringBuilder getName() {
        return new StringBuilder(name);     // возвращаем копию, чтобы нельзя было отредактировать
    }

    public void setName(StringBuilder s) {
        if(s.length() >= 3) {
            name = s;
        } else {
            System.out.println("Длина имени менее 3 символов!");
        }
    }

    /*курс*/
    public int getCourse() {
        return course;
    }
    public void setCourse(int i) {
        if(i >= 1 && i <= 5) {
            course = i;
        } else {
            System.out.println("Введите курс от 1 до 5!");
        }
    }

    /*оценка*/
    public double getGrade() {
        return grade;
    }
    public void setGrade(double g) {
        if (g >= 1 && g <= 10) {
            grade = g;
        } else {
            System.out.println("Введите оценку от 1 до 10!");
        }
    }

    public void showInfo () {
        System.out.println("----------");
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Средний балл: " + getGrade());
    }

}

class TestStudent{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName(new StringBuilder("Mihail"));
        s1.setCourse(5);
        s1.setGrade(8.8);

        System.out.println(s1.getName());
        System.out.println(s1.getCourse());
        System.out.println(s1.getGrade());

        s1.showInfo();
    }
}
