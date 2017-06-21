package BankAccount;

/**
 * Created by enilmaa on 2017-06-21.
 */
public class User {

    public static void main(String args[]){
        BankAccount nikhil =  new BankAccount();
        nikhil.setAccount("123456789");
        nikhil.setBalance(50000);
        nikhil.setMobile("+4677777777");
        nikhil.setEmail("nikhilreddymara@gmail.com");
        nikhil.setName("Mara Nikhil Reddy");
        System.out.println(nikhil.getAccount());
        System.out.println(nikhil.getBalance());
        nikhil.deposit(20000);
        System.out.println(nikhil.getBalance());
        nikhil.withdraw(20000);
        System.out.println(nikhil.getBalance());

    }

}
/*output

123456789
50000.0
70000.0
50000.0

*/
