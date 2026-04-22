class BankAccount {
    private double balance;  // private variable

    // Setter
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}