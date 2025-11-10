package Lesson28;

public class Test8 {

    void marathon(int temperature, int tempBega) throws PodvernutNoguException{
        if(tempBega > 12){
           throw new PodvernutNoguException("Temp bega bil visokim: " + tempBega);
        }
        if (temperature>32){
            throw new SveloMishcuException();
        }
        System.out.println("Vi zavershili marafon");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        try {
            t.marathon(20, 15);
        }
        catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Vi poluchite gramotu");
        }
    }
}


class PodvernutNoguException extends Exception {

    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {
    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {
    }
}
