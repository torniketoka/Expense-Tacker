import java.util.Date;
import java.util.List;

public class Expense extends Transaction {
    public Expense(int accountID, Date date, double amount, String description) {
        super(accountID, date, amount, description);
    }
}
