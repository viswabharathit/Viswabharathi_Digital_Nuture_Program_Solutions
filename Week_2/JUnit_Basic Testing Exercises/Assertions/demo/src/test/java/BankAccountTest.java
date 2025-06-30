import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        assertEquals(1000.0, account.getBalance(), 0.001, "Initial balance should match");
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("John Doe", 500.0);
        account.deposit(200.0);
        assertEquals(700.0, account.getBalance(), 0.001, "Balance after deposit should be correct");
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("John Doe", 800.0);
        account.withdraw(300.0);
        assertEquals(500.0, account.getBalance(), 0.001, "Balance after withdrawal should be correct");
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount("John Doe", 500.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount("John Doe", 400.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(500.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount("John Doe", 400.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
