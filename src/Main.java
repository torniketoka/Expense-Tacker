

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createAccount();

//        System.out.println("Account List: " + controller.getAccountList());
//        System.out.println("Transaction List: " + controller.getTransactionList());
//        System.out.println("Total Balance: " + controller.getTotalBalance());
//
//        controller.createTransaction();
//        controller.createTransaction2();
//        controller.createTransaction3();
//        controller.createTransaction4();
//
//        System.out.println("Account List: " + controller.getAccountList());
//        System.out.println("Transaction List: " + controller.getTransactionList());
//        System.out.println("Total Balance: " + controller.getTotalBalance());
//
//
//        System.out.println("---------------------------------------------------");
//
//
//        System.out.println("Size = " + controller.getTransactionList().size());
//
//
//
//        // Test Iterator
//        for (Iterator iter = controller.getIterator(); iter.hasNext(); ) {
//            Transaction t = (Transaction) iter.getNext();
//            System.out.println("Transaction ---->  : " + t);
//        }
//
//
//
//        // Test Composit
//        Transaction flag = controller.getTransactionList().get(0);
//        flag.addChildTransaction(controller.getTransactionList().get(1));
//        flag.addChildTransaction(controller.getTransactionList().get(2));
//        flag.addChildTransaction(controller.getTransactionList().get(3));
//
//
//        System.out.println("---------------------------------------------------");
//
//
//        System.out.println(controller.getTransactionList().get(0));
//
//
//        for (Transaction transaction : flag.getChildTransactions()) {
//            System.out.println(transaction);
//
//
//        }

        System.out.println("Balance before: " + controller.getAccountList().get(0).getBalance() );
        controller.createTransaction();
        controller.createTransaction();
        controller.createTransaction();
        System.out.println("Balance after: " + controller.getAccountList().get(0).getBalance() );

    }
}