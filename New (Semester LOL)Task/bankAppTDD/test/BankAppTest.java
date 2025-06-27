import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {

    @BeforeEach
    public void setUp() {
        Account bolajiAccount = new Account("0990");
    }
    @Test
    public void testThatYouCanGetTheBalance() {
        Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatDepositWorks() {
        //Given
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));

        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatYouCanDepositMultipleTimes() {
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(3000);
        assertEquals(4000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatBalanceRemainsUnchangedIfANegativeNegativeAmountIsDeposited() {
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(-1000);
        assertEquals(0,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatWithdrawWorks() {
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(10000);
        assertEquals(10000,bolajiAccount.getBalance("0990"));
        bolajiAccount.withdraw(5000);
        assertEquals(5000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatYouCanWithdrawMultipleTimes() {
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(100000);
        assertEquals(100_000,bolajiAccount.getBalance("0990"));
        bolajiAccount.withdraw(5000);
        assertEquals(95_000,bolajiAccount.getBalance("0990"));
        bolajiAccount.withdraw(5000);
        assertEquals(90_000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatYouCanWithdrawANegativeFigure(){
         Account bolajiAccount = new Account("0990");
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(10_000);
        assertEquals(10_000,bolajiAccount.getBalance("0990"));
        bolajiAccount.withdraw(-500);
        assertEquals(10_000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testGetBalanceReturns_ZeroIf_IncorrectPasswordIsInputted() {
        Account bolajiAccount = new Account("0990");
        bolajiAccount.deposit(1000);
        assertEquals(0, bolajiAccount.getBalance("1234"));

        
    }
    
}
