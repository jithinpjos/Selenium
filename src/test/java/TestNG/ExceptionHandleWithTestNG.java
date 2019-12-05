package TestNG;

import org.testng.annotations.Test;

public class ExceptionHandleWithTestNG {
	
/*	@Test(invocationTimeOut=10)
	public void loginTest() {
		int i=1;
		while(i==1)
		{
		System.out.println(i);
		}
	}
	*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void loginTest1() {
		String i="100A";
		Integer.parseInt(i);
		
	}

}
