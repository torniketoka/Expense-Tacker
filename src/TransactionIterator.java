


public class TransactionIterator implements Iterator {



    private int index;
    private Controller controller;

    public TransactionIterator(Controller controller) {
        this.index = 0;
        this.controller = controller;
    }

    @Override
    public boolean hasNext() {
        return index < controller.getTransactionList().size();
    }

    @Override
    public Transaction getNext() {
        if(this.hasNext()){
            return  controller.getTransactionList().get(index++);
        }
        return null;
    }
}

