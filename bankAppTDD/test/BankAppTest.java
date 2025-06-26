import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {

    @Test
    public void testThatYouCanGetTheBalance() {
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
    }

    @Test
    public void testThatDepositWorks() {
        //Given
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());

        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance());
    }

    @Test
    public void testThatYouCanDepositMultipleTimes() {
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
        bolajiAccount.deposit(1000);
        assertEquals(1000,bolajiAccount.getBalance());
        bolajiAccount.deposit(3000);
        assertEquals(4000,bolajiAccount.getBalance());
    }

    @Test
    public void testThatBalanceRemainsUnchangedIfANegativeNegativeAmountIsDeposited() {
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
        bolajiAccount.deposit(-1000);
        assertEquals(0,bolajiAccount.getBalance());
    }

    @Test
    public void testThatWithdrawWorks() {
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
        bolajiAccount.deposit(10000);
        assertEquals(10000,bolajiAccount.getBalance());
        bolajiAccount.withdraw(5000);
        assertEquals(5000,bolajiAccount.getBalance());
    }

    @Test
    public void testThatYouCanWithdrawMultipleTimes() {
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
        bolajiAccount.deposit(100000);
        assertEquals(100_000,bolajiAccount.getBalance());
        bolajiAccount.withdraw(5000);
        assertEquals(95_000,bolajiAccount.getBalance());
        bolajiAccount.withdraw(5000);
        assertEquals(90_000,bolajiAccount.getBalance());
    }

    @Test
    public void testThatYouCanWithdrawANegativeFigure(){
        Account bolajiAccount = new Account();
        assertEquals(0,bolajiAccount.getBalance());
        bolajiAccount.deposit(10_000);
        assertEquals(10_000,bolajiAccount.getBalance());
        bolajiAccount.withdraw(-500);
        assertEquals(10_000,bolajiAccount.getBalance());
    }

}
