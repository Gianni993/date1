import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        //data in formato aaaa - mm -gg
        LocalDate data = LocalDate.now();
        System.out.println(data);

        //ora e i fottutissimi nanosecondi
        LocalTime ora_nanosec = LocalTime.now();
        System.out.println(ora_nanosec);

        //data e ora e bastardissimi nanosec
        LocalDateTime c = LocalDateTime.now();
        System.out.println(c + "\n");
        
        //per formattare la data usare il DateTimeFormatter
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //oppure dd/MM/yyyy  MMM per mese compatto MMMM per mese esteso
        //ri sua la variabile data creata prima, aggiungi il metodo forma e gli passi la variabile formattata
        System.out.println(data.format(formato));

        //altre fortmattazioni
        //estesa con giorno della settimana
        formato = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy");
        System.out.println(data.format(formato));
        

        //OffsetDataTime.stampaDate();
    }
}
