package Lesson13;

public class WorkSchedule {
    public static void main(String[] args) {
        switch ("pt") {                             // свич может содержать выражение
            case "pn", "vt", "sr", "cht":           // перебор условий в одном кейзе
                System.out.println("do 18:00");
                break;
            case "pt":                              // кейзы могут содержать только константы
                System.out.println("do 17:00");
                break;
            case "sb", "vs":
                System.out.println("weekend");
                break;
            default:
                System.out.println("Takogo dnya net");
        }
    }
}
