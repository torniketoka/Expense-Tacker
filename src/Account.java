public abstract class Account implements Observer {
    private String owner;
    private double balance;
    private int id;

    public Account(String owner, double balance, int id) {
        this.owner = owner;
        this.balance = balance;
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", id=" + id +
                '}';
    }
}
