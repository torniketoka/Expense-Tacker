

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Controller implements Container, Subject {
    private double totalBalance;
    private List<Transaction> transactionList = new ArrayList <>();
    private List<Account> accountList = new ArrayList <>();

    //Observer pattern
    private List<Observer> observers = new ArrayList <Observer>();

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
        Account account = new Card("Hakob", 100, 111);
        sendAccountToList(account);
        registerObserver(account);
    }

    public void sendAccountToList(Account account) {
        appendToAccountList(account);
    }

    public void createTransaction() {
        Transaction transaction2 = new Expense(111, Calendar.getInstance().getTime(), 10, "Sarochka");
        sendTransactionToList(transaction2);
    }

    public void sendTransactionToList(Transaction transaction) {
        appendToTransactionList(transaction);
        notifyObservers();
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

    //Iterator pattern
    @Override
    public Iterator getIterator() {
        return new TransactionIterator(this);
    }

    //Observer pattern
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(transactionList.get(transactionList.size()-1));
        }
    }

}
