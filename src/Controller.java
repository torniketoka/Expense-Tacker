

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Controller implements Container{
    private double totalBalance;
    private List<Transaction> transactionList = new ArrayList <>();
    private List<Account> accountList = new ArrayList <>();

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

    public void appendToTransactionList(Transaction transaction) {
        transactionList.add(transaction);
    }
    public void appendToAccountList(Account account) {
        accountList.add(account);
    }


    public void createAccount() {
        Account account = new Cash("Hakob", 100, 111);
        sendAccountToList(account);
    }

    public void sendAccountToList(Account account) {
        appendToAccountList(account);
    }

    public void createTransaction() {
        Transaction transaction1 = new Expense(111, Calendar.getInstance().getTime(), 100, "Shoes");
        sendTransactionToList(transaction1);
    }

    public void sendTransactionToList(Transaction transaction) {
        appendToTransactionList(transaction);
    }


    public void createTransaction2() {
        Transaction transaction2 = new Expense(112, Calendar.getInstance().getTime(), 99, "Sarochka");
        sendTransactionToList(transaction2);
    }
    public void createTransaction3() {
        Transaction transaction3 = new Expense(113, Calendar.getInstance().getTime(), 100, "Naski");
        sendTransactionToList(transaction3);
    }
    public void createTransaction4() {
        Transaction transaction4 = new Expense(114, Calendar.getInstance().getTime(), 100, "Shuba");
        sendTransactionToList(transaction4);
    }


    @Override
    public Iterator getIterator() {
        return new TransactionIterator(this);
    }
}
