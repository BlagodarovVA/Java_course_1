package Lesson13;

public class Test1 {

}

class Student {
    int grade;
    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(4);

        System.out.println("if:");
        if (st1.grade == 2) {
            System.out.println("Двоечник");
        } else if (st1.grade == 3) {
            System.out.println("Троечник");
        } else if (st1.grade == 4) {
            System.out.println("Хорошист");
        } else if (st1.grade == 5) {
            System.out.println("Скорее всего задрот");
        } else {
            System.out.println("Не правильная оценка");
        }

        System.out.println("switch:");
        switch (st1.grade) {
            case 2:
                System.out.println("Двоечник");
                break;                              // выход из свича
            case 3:
                System.out.println("Троечник");
                break;
            case 4:
                System.out.println("Хорошист");
                break;
            case 5:
                System.out.println("Скорее всего задрот");
                break;
            default:                                          // сработает, если не найден подходящий кейс
                System.out.println("Не правильная оценка");
        }
    }
}
