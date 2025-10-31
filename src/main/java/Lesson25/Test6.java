package Lesson25;

public class Test6 {
    public static void main(String[] args) {
        String [] array1 = {"privet", "poka"};
        Object [] array2 = array1;              // upcasting автоматический
        String [] array3 = (String[]) array2;   // downcasting вручную

        //array3[0] = new StringBuilder("ok");    // ошибка компиляции
        array2[0] = new StringBuilder("ok");        // ошибка выполнения, т.к. объект на самом деле имеет тип String []
    }
}
