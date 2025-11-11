package Lesson28;

public class DZEx {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
//        t.eat("trava");

        try{
            t.drink("voda");

            try {
                t.drink("sok");
            }
            catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Inner finally block");
            }

        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (NeVodaException e) {
            System.out.println(e.getMessage());
        }
    }
}


class Tiger{
    void eat(String food){
        if (!food.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + food);
        }
        System.out.println("Tigr est myaso");
    }

    void drink(String water) throws NeVodaException {
        if (!water.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + water);
        }
        System.out.println("Tigr pyet vodu");
    }
}



class NeMyasoException extends RuntimeException{
    NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception{
    NeVodaException(String message) {
        super(message);
    }
}

