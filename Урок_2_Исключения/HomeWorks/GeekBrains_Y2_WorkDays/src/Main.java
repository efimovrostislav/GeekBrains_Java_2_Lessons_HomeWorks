import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        WorkDays w1 = WorkDays.WEDNESDAY;
        WorkDays.method(WorkDays.MONDAY);
        WorkDays.method(WorkDays.TUESDAY);
        w1.method(w1);

//        try {
//            FileInputStream fileInputStream = new FileInputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
