package Lesson4;

public class BancAccount {

    int id;
    String name;
    double balance;

    // переопределение метода позволяет выводить в консоль содержимое объекта, а не адрес
    @Override
    public String toString() {
        return "BancAccount {" + "id='" + id + '\'' + ", name=" + name + '\'' + ", balance=" + balance + '}';
    }

    public static void main(String[] args) {

        BancAccount myAcc = new BancAccount();
        BancAccount otherAcc = new BancAccount();

        System.out.println(myAcc); // ссылка на адрес с объектом, если не переопределить метод toString

        myAcc.id = 1;
        myAcc.name = "vblagodarov";
        myAcc.balance = 525_000.00;

        System.out.println(myAcc);
        System.out.println(otherAcc);

        int num = 25;
        System.out.println("zifra - " + num);



    }
}
