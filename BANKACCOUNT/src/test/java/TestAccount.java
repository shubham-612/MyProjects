import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.Account;

public class TestAccount {
	
	Account acc;
	
	@BeforeEach
	public void Initial()
	{
		acc = new Account();
		System.out.println("Hello !! Before All test");
	}
	
	@Test
	public void TestDeposit() {
		acc.deposit(100.00);
		assertEquals(100.00, acc.getBalance());
	}
	
	@Test
	public void Checkbalance()
	{
		assertEquals(0.0, acc.getBalance());
	}
	
	@Test
	public void TestWithdraw()
	{
		acc.deposit(100.00);
		acc.withdraw(50.0);
		assertEquals(50.00, acc.getBalance());
	}
	
	@Test
	public void MoreWithdraw()
	{
		acc.withdraw(50);
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{
			acc.deposit(-100.0);
		});
		assertEquals("Deposit should be positive", exception.getMessage());
    }
	}
}
