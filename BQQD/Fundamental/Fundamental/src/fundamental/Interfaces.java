
package fundamental;

interface IABCBank{
    void openAccount();
    void closeAccount();
}
interface IBankAccount{
    void deposit();
    void withdraw();
    void balance();
}

class Saving implements IBankAccount, IABCBank{

    @Override
    public void deposit() {
        System.out.println("Deposit in saving account");
    }

    @Override
    public void withdraw() {
        System.out.println("With draw from svaing account");
    }

    @Override
    public void balance() {
        System.out.println("Balance in saving account");
    }

    @Override
    public void openAccount() {
        System.out.println("Open Account.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account.");
    }

    
}
public class Interfaces {
    public static void main(String[] args) {
        Saving saving = new Saving();
        saving.openAccount();
        saving.balance();
        saving.deposit();
        saving.withdraw();
        saving.closeAccount();
    }
}
