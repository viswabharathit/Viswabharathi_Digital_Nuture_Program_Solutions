import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testDeposit_VerifyInteractions() {
        // Arrange
        BankAccount mockAccount = mock(BankAccount.class);
        when(repository.findByAccountNumber("123")).thenReturn(mockAccount);

        // Act
        service.deposit("123", 200.0);

        // Assert / Verify interactions
        verify(repository).findByAccountNumber("123");
        verify(mockAccount).deposit(200.0);
        verify(repository).save(mockAccount);

        // Ensure no unexpected calls
        verifyNoMoreInteractions(repository, mockAccount);
    }

    @Test
    void testWithdraw_VerifyInteractions() {
        // Arrange
        BankAccount mockAccount = mock(BankAccount.class);
        when(repository.findByAccountNumber("123")).thenReturn(mockAccount);

        // Act
        service.withdraw("123", 100.0);

        // Assert / Verify interactions
        verify(repository).findByAccountNumber("123");
        verify(mockAccount).withdraw(100.0);
        verify(repository).save(mockAccount);

        verifyNoMoreInteractions(repository, mockAccount);
    }
}
