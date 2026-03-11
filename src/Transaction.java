import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime date;
    private String description;

    Transaction(String type, double amount, LocalDateTime date, String description){
        this.type= type;
        this.amount= amount;
        this.date= date;
        this.description=description;
    }

    @Override
    public String toString(){
        return type + " | " + amount + " | " + date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)) + " | " + description;
    }
}
