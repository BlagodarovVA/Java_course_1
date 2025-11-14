package Lesson30;

public class Test4 {
    static void def(Test5 t){
//        System.out.println(t.abc("privet"));
        System.out.println(t.abc("privet", "poka"));
    }

    public static void main(String[] args) {
//        def(x -> x.length());
        def((x,y) -> x.length() + y.length());
    }
}

interface Test5{
//    int abc(String s);
    int abc(String s1, String s2);
}