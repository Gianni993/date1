import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class OffsetDataTime {
    
    public static void stampaDate(){
    String dataString = "2002-03-01T13:00:00Z";
    
    OffsetDateTime data = OffsetDateTime.parse(dataString);

    // Formatta la data in FULL
    System.out.println(data.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss z")));

    // Formatta la data in MEDIUM
    System.out.println(data.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss")));

    // Formatta la data in SHORT
    System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

}
}