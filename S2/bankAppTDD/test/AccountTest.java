import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    Account bolajiAccount;

    @BeforeEach
    public void setUp() {
        bolajiAccount = new Account("0990");
    }
    @Test
    public void testThatYouCanGetTheBalance() {
        assertEquals(0,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatDepositWorks() {
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatYouCanDepositMultipleTimes() {
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(3000);
        assertEquals(4000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatBalanceRemainsUnchangedIfANegativeNegativeAmountIsDeposited() {
        assertEquals(0,bolajiAccount.getBalance("0990"));
        assertThrows(InvalidAmountException.class, ()-> bolajiAccount.deposit(-1000));
        assertEquals(0,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatWithdrawWorks() {
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(10000);
        assertEquals(10000,bolajiAccount.getBalance("0990"));
        bolajiAccount.withdraw(5000);
        assertEquals(5000,bolajiAccount.getBalance("0990"));
    }

    @Test
    public void testThatYouCanWithdrawMultipleTimes() {
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
        assertEquals(0,bolajiAccount.getBalance("0990"));
        bolajiAccount.deposit(10_000);
        assertEquals(10_000,bolajiAccount.getBalance("0990"));
        assertThrows(InvalidAmountException.class, ()-> bolajiAccount.withdraw(-500));
        assertEquals(10_000,bolajiAccount.getBalance("0990"));
    }


    @Test
    public void testThrowExceptionWhenUsingGetBalanceWithIncorrectBalance(){
        assertThrows(IncorrectPinException.class, () -> bolajiAccount.getBalance("1234"));
    }


    @Test
    public void testThatExceptionIsThrownWhenAnInvalidAmountIsThrown(){
        assertThrows(InvalidAmountException.class, () -> bolajiAccount.deposit(-9000));
    }


    @Test
    public void testThatExceptionIsThrownWhenUserTriesToWithdrawMoreThanWhatIsInTheAccountBalance(){
        assertThrows(InsufficientFundException.class, ()->bolajiAccount.withdraw(500));
        assertEquals(0,bolajiAccount.getBalance("0990"));
    }



}
