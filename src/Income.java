import java.util.Date;
import java.util.List;

public class Income extends Transaction {
    public Income(int accountID, Date date, double amount, String description) {
        super(accountID, date, amount, description);
    }
}
