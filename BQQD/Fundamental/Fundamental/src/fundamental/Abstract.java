package fundamental;

abstract class BackAccount{
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingAccount extends BackAccount{

    @Override
    void deposit() {
        System.out.println("Deposit in saving account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from saving account");
    }

    @Override
    void balance() {
        System.out.println("Balance in saving account");
    }
    
}
public class Abstract {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.balance();
    }
}
