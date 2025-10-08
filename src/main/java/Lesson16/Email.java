package Lesson16;

public class Email {

    public static void email(String mail) {

        int startEmail = 0;

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == ';') {

                String res = mail.substring(startEmail, i);
                res = res.substring(res.indexOf('@') + 1, res.indexOf('.'));
                System.out.println(res);


            } else if (i > 0 && mail.charAt(i-1) == ' ' && mail.charAt(i) != ' ') {
                startEmail = i;
            }
        }

    }


    public static void main(String[] args) {

        email("ewrtewtr@yahoo.com; fjf@mail.ru; weur@gmail.com;");

    }
}
