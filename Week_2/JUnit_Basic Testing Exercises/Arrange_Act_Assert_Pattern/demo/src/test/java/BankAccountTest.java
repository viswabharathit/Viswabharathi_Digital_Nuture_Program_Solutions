import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Setup: Create a new account before each test
        account = new BankAccount("John Doe", 1000.0);
        System.out.println("Setup: New account created");
    }

    @AfterEach
    void tearDown() {
        // Teardown: You could clean up resources if needed
        account = null;
        System.out.println("Teardown: Account reset");
    }

    @Test
    void testDepositIncreasesBalance() {
        // Arrange (already done in setUp)

        // Act
        account.deposit(500.0);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawDecreasesBalance() {
        // Arrange

        // Act
        account.withdraw(300.0);

        // Assert
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawInsufficientFundsThrowsException() {
        // Arrange

        // Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000.0);
        });

        assertEquals("Insufficient balance.", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        // Arrange

        // Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100.0);
        });

        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmountThrowsException() {
        // Arrange

        // Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        });

        assertEquals("Withdraw amount must be positive.", exception.getMessage());
    }
}
