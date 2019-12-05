package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void loginTest() {
		System.out.println("Login to the application");
		int i=4/0;
		System.out.println(i);
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest() {
		System.out.println("Search page test");
	}

}
