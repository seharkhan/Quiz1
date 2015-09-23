import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class AccountTest {

	static Account a;
	


	@Before
	public void setUp() throws Exception {
		a = new Account(1122,20000);
		double d = .045/12;
		a.getDatecreated();
		System.out.println("The date the account was created is: " + a.getDatecreated());
		System.out.println("The monthly interest is: " + a.getMonthlyInterestRate(.045)*100 +"%");
		System.out.println("The balance is: " + "$"+ a.getBalance());
			
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
        a.Withdraw(23500);
        assertEquals((long)a.getBalance(),(long)-500.00);
	}

	
	
	@Test
	public final void testDeposit() {
		a.Deposit(3000);
		assertEquals((long)a.getBalance(),(long)23000.00);
		a.Deposit(2000);
		assertEquals((long)a.getBalance(),(long)25000);
        
	}
	
	public final void testGetMonthlyInterestRate() {
		a.getMonthlyInterestRate(.045);
		assertEquals(".045",.00375);
	}
	

}
