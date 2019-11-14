
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction{
    private int accountID;
    private Date date;
    private double amount;
    private String description;
    private List<Transaction> childTransactions;


    public Transaction(int accountID, Date date, double amount, String description){
        this.accountID = accountID;
        this.date = date;
        this.amount = amount;
        this.description = description;
        childTransactions = new ArrayList<Transaction>();
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<Transaction> getChildTransactions() {
        return childTransactions;
    }


    public void addChildTransaction(Transaction t) {
        childTransactions.add(t);
    }


    public void removeChildTransaction(Transaction t) {
        childTransactions.remove(t);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountID=" + accountID +
                ", date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

}
