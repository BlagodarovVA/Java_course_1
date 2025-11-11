package Lesson28;

public class Test11 {
    void abc(){
        System.out.println("method abc");
        throw new StackOverflowError();
    }
    void def(){
        try {
            abc();
            return;
        }
        finally {
            System.out.println("block finnaly");        // finally отработает несмотря на ошибку
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.def();
    }
}
