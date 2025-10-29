package Lesson24.DZ;

interface ISpeakable{
    default void speak(){
        System.out.println("Кто-то говорит");
    }
}
