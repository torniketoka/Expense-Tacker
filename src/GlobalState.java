

import java.util.ArrayList;
import java.util.List;

public class GlobalState implements Container{

    private double totalBalance;
    private List<Transaction> transactionList = new ArrayList <>();
    private List<Account> accountList = new ArrayList <>();
    public GlobalState() {
        totalBalance = 10000;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public List <Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List <Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List <Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List <Account> accountList) {
        this.accountList = accountList;
    }

    //NEW: в контроллере создастся Transaction, и контроллер обращаетится
    // globalState.appendToTransactionList(transaction) чтобы добавить в лист новую транзакцию
    public void appendToTransactionList(Transaction transaction) {
        transactionList.add(transaction);
    }
    // то же что и вверху
    public void appendToAccountList(Account account) {
        accountList.add(account);
    }


    @Override
    public Iterator getIterator() {
        return  new TranslateIterator(this  );
    }


    @Override
    public String toString() {
        return "GlobalState{" +
                "transactionList=" + transactionList +
                '}';
    }
}
