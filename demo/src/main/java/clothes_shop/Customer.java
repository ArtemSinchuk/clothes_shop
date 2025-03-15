package clothes_shop;

import javax.swing.*;

public class Customer extends JFrame {
    int balance;

    public Customer() {
      this.balance = 0;
    }

    public int getBalance() {
      return balance;
    }

    public void setBalance(int balance) {
      this.balance = balance;
    }

    @Override
    public String toString() {
        return "balance: " + balance;
    }
}