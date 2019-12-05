package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=12)
	public void loginTest() {
		int i=10;
		int j=20;
		System.out.println(i+j);
	}

}
