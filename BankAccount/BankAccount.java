package BankAccount;

/**
 * Created by enilmaa on 2017-06-21.
 */
public class BankAccount {

    private String name;
    private String email;
    private String mobile;
    private String account;
    private double balance;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String name){
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance){
        this.balance+=balance;

    }
    public void withdraw(double balance){
        this.balance-=balance;

    }
}

