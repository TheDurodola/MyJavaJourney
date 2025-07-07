import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankTest {
    Bank yrsdBank;

    @BeforeEach
    public void setUp() {
        yrsdBank = new Bank();
    }

    @Test
    public void testThatAccountCanBeAdded(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1236");
    }

    @Test
    public void testThatAccountNumberCanBeFound(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1236");
        assertTrue(yrsdBank.accessAccount("1234567890", "1236"));

    }

    @Test
    public void testExceptionIsThrownIfAccountDoesntExist(){
        assertThrows(AccountNotFoundInDatabaseException.class, ()->yrsdBank.accessAccount("1234567820", "1236"));
    }

    @Test
    public void testThatMoneyCanBeDepositedIntoAccount(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1230");
        yrsdBank.accessAccount("1234567890", "1230");
        yrsdBank.deposit(1_000);
        assertEquals(1000, yrsdBank.getBalance("1230"));
    }

    @Test
    public void testThatDepositAndWithdrawnWontWorkIfYouDontHaveDontLAccount(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1230");
        yrsdBank.accessAccount("1234567890", "1230");
        yrsdBank.deposit(1_000);
    }

    @Test
    public void testThatMoneyCanBeWithdrawnFromAccount(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1230");
        yrsdBank.accessAccount("1234567890", "1230");
        yrsdBank.deposit(1_000);
        yrsdBank.withdrawn("1230",500);
        assertEquals(500, yrsdBank.getBalance("1230"));
    }

    @Test
    public void testThatBalanceCantBeLessThan100(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1236");
        yrsdBank.accessAccount("1234567890", "1236");
        yrsdBank.deposit(1_000);
        yrsdBank.withdrawn("1236",500);
        assertEquals(500, yrsdBank.getBalance("1236"));
        assertThrows(InsufficientFundException.class, ()->yrsdBank.withdrawn("1236",450));
    }

    @Test
    public void testThatMoneyCanBeTransferredToOneAccountToAnotherAccount(){
        yrsdBank.createAccount("John", "Doe", "1234567890", "1236");
        yrsdBank.createAccount("Joshua", "Omisakin", "1234567892", "1230");
        yrsdBank.accessAccount("1234567890", "1236");
        yrsdBank.deposit(1_000);
        yrsdBank.transfer("1236","1234567892", 500);
        assertEquals(500, yrsdBank.getBalance("1236"));
        yrsdBank.accessAccount("1234567892", "1230");
        assertEquals(500, yrsdBank.getBalance("1230"));
    }

}
