import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAtmSimulationTest{

	@Test
	
	public void testThatDepositAmountExist(){
		double balance = 0;
		double depositedAmount = 5000;
		BankAtmSimulation.depositFromAccount(balance,depositedAmount);

	}
	
	@Test
	public void  testThatDepositAmountWorks(){
		double balance = 0;
		double depositedAmount = 50000;
		double actual = BankAtmSimulation.depositFromAccount(balance,depositedAmount);
		double expect = 50000;
		assertEquals(actual, expect);
	}


	@Test
	
	public void testThatWithdrawAmountExist(){
		double balance = 0;
		double depositedAmount = 5000;
		BankAtmSimulation.withdrawFromAccount(balance,depositedAmount);

	}
	
	@Test
	public void  testThatWithdrawAmountWorks(){
		double balance = 50000;
		double amount = 20000;
		double actual = BankAtmSimulation.withdrawFromAccount(balance,amount);
		double expect = 29900;
		assertEquals(actual, expect);
	}

	@Test
	public void  testThatDepositAmountRejectsNegativeAmount(){
		double balance = 0;
		double depositedAmount = -77;
		double actual = BankAtmSimulation.depositFromAccount(balance,depositedAmount);
		double expect = 0;
		assertEquals(actual, expect);
	}


	@Test
	public void  testThatWithdrawAmountRejectsWithdrawalAmountThatExceedTheMaxAmountWithdrawable(){
		double balance = 50000;
		double amount = 45000;
		double actual = BankAtmSimulation.withdrawFromAccount(balance,amount);
		double expect = 50000;
		assertEquals(actual, expect);
	}




}