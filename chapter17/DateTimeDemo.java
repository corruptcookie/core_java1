import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        Instant i = Instant.now();
        System.out.println(i);
    }
}
