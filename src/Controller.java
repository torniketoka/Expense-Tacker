

import java.util.ArrayList;
import java.util.Calendar;

public class Controller {
    private GlobalState globalState;

    public Controller() {
        this.globalState = new GlobalState();
    }

    public GlobalState getGlobalState() {
        return globalState;
    }

    public void setGlobalState(GlobalState globalState) {
        this.globalState = globalState;
    }

    public void createAccount() {
        Account account = new Cash("Hakob", 100, 111);
        sendAccountToList(account);
    }
//sendAccountToList и sendTransactionToList strategy pattern можно сделать
    public void sendAccountToList(Account account) {
        globalState.appendToAccountList(account);
    }

    public void createTransaction() {
        Transaction transaction1 = new Expense(111, Calendar.getInstance().getTime(), 100, "Shoes");
        sendTransactionToList(transaction1);
    }

    public void sendTransactionToList(Transaction transaction) {
        globalState.appendToTransactionList(transaction);
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


}
