public class BankService {
    private BankRepository repository;

    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = repository.findByAccountNumber(accountNumber);
        account.deposit(amount);
        repository.save(account);
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = repository.findByAccountNumber(accountNumber);
        account.withdraw(amount);
        repository.save(account);
    }
}
