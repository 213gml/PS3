package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InsufficientFundsException {
		
		try {
			
			//Test account is created
			Account tAccount = new Account(1122, 20000);
			tAccount.setAnnualInterestRate(4.5);
			tAccount.withdraw(2500);
			tAccount.deposit(3000);
			tAccount.accountStatement(tAccount.getBalance(), 
			tAccount.getMonthlyInterestRate(tAccount.getAnnualInterestRate()), 
			tAccount.getDateCreated());
			
			//Testing the exception by withdrawing too much money
			tAccount.withdraw(100000);
			
		} catch(InsufficientFundsException ife) {
			
			//Alerts the user if the exception is raised
			System.out.println("Insufficient Funds");
		}
		
		
		
	}


}
