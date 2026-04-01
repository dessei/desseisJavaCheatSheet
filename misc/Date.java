package misc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {
        //LocalDate, LocalTime, LocalDateTime, UTC timestamp

        LocalDate date = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM/yyyy");
        String dateString = date.format(myFormat);
        System.out.println(dateString);
    }
}