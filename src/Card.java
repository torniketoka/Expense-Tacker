public class Card extends Account {
    public Card(String owner, double balance, int id) {
        super(owner, balance, id);
    }

    @Override
    public void update(Transaction transaction) {
        if(this.getId() == transaction.getAccountID()) {
            this.setBalance(this.getBalance() - transaction.getAmount());
        }
    }

}
