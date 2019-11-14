

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createAccount();

        System.out.println("Account List: " + controller.getGlobalState().getAccountList());
        System.out.println("Transaction List: " + controller.getGlobalState().getTransactionList());
        System.out.println("Total Balance: " + controller.getGlobalState().getTotalBalance());

        controller.createTransaction();
        controller.createTransaction2();
        controller.createTransaction3();
        controller.createTransaction4();

        System.out.println("Account List: " + controller.getGlobalState().getAccountList());
        System.out.println("Transaction List: " + controller.getGlobalState().getTransactionList());
        System.out.println("Total Balance: " + controller.getGlobalState().getTotalBalance());


        System.out.println("---------------------------------------------------");


        System.out.println("Size = " + controller.getGlobalState().getTransactionList().size());



        // Test Iterator
        for (Iterator iter = controller.getGlobalState().getIterator(); iter.hasNext(); ) {
            Transaction t = (Transaction) iter.getNext();
            System.out.println("Transaction ---->  : " + t);
        }



        // Test Composit
        Transaction flag = controller.getGlobalState().getTransactionList().get(0);
        flag.addChildTransaction(controller.getGlobalState().getTransactionList().get(1));
        flag.addChildTransaction(controller.getGlobalState().getTransactionList().get(2));
        flag.addChildTransaction(controller.getGlobalState().getTransactionList().get(3));


        System.out.println("---------------------------------------------------");


        System.out.println(controller.getGlobalState().getTransactionList().get(0));


        for (Transaction transaction : flag.getChildTransactions()) {
            System.out.println(transaction);


        }
    }
}