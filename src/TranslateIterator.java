


public class TranslateIterator implements Iterator {



    private int index;
    private GlobalState globalState;

    public TranslateIterator(GlobalState globalState) {
        this.index = 0;
        this.globalState = globalState;
    }

    @Override
    public boolean hasNext() {
        return index < globalState.getTransactionList().size();
    }

    @Override
    public Transaction getNext() {
        if(this.hasNext()){
            return  globalState.getTransactionList().get(index++);
        }
        return null;
    }
}

