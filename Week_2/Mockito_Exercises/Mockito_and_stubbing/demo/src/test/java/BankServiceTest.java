import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BankServiceTest {

    private BankRepository repository;
    private BankService service;

    @BeforeEach
    void setUp() {
        repository = mock(BankRepository.class);
        service = new BankService(repository);
    }

    @Test
    void testGetBalance() {
        // Arrange (Stubbing)
        BankAccount mockAccount = new BankAccount("123", 500.0);
        when(repository.findByAccountNumber("123")).thenReturn(mockAccount);

        // Act
        double balance = service.getBalance("123");

        // Assert
        assertEquals(500.0, balance);
    }

    @Test
    void testDeposit() {
        // Arrange
        BankAccount mockAccount = new BankAccount("123", 500.0);
        when(repository.findByAccountNumber("123")).thenReturn(mockAccount);

        // Act
        service.deposit("123", 200.0);

        // Assert
        assertEquals(700.0, mockAccount.getBalance());
        verify(repository).save(mockAccount);  // Verify save is called
    }

    @Test
    void testWithdraw() {
        // Arrange
        BankAccount mockAccount = new BankAccount("123", 500.0);
        when(repository.findByAccountNumber("123")).thenReturn(mockAccount);

        // Act
        service.withdraw("123", 100.0);

        // Assert
        assertEquals(400.0, mockAccount.getBalance());
        verify(repository).save(mockAccount);
    }
}
