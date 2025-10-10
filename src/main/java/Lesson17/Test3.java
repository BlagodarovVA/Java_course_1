package Lesson17;

public class Test3 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Good bye");

        String s1 = new String(sb1);        // строку можно создать из билдера и буфера
        String s2 = new String(sb2);
    }

}
