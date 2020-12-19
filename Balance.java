package Banking_Management_classes;

import java.util.Date;
import java.util.Scanner;
public class Balance {
    private double balance;
    private Date date;
    private long accountNum;
    Scanner sc = new Scanner(System.in);

    
    
    public Balance(long accountNo, double money, Date accountDate) {
        accountNum = accountNo;
        balance = money;
        date = (Date) accountDate.clone();
        System.out.println("New account created with account no :" + accountNum);
        System.out.println("Opening balance rs. " + balance);
        System.out.println("Account created on " + date.toString());
    }

    public Balance(Balance b) {
        balance = b.balance;
        date = b.date;
        accountNum = b.accountNum;
    }

    public Balance() {

    }

    
    public long getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "A/C no.: " + accountNum + "\n \n Current balance: " + balance
                + "\n Last date of update:" + date+ "\n\n";

    }

}
