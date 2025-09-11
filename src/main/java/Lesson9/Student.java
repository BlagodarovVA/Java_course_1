package Lesson9;

public class Student {

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;                    // ссылка без объекта

        st1 = null;                     // связь с объектом удалена, поэтому он удаляется

    }
    // за передами метода объекты из метода не существуют
}
