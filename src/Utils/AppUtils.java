package Utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
	@BeforeTest
	public void login() 
	{
		System.out.println("Gmail login");
		
	}
	@AfterTest
	public void logout() 
	{
		System.out.println("Gmail logout");
		
	}
	@BeforeSuite
	public static void lanchGMail() 
	{
		System.out.println("open gmail App");
		
	}
	@AfterSuite
	public static void closeApp() 
	{
		System.out.println("close Gmail App");
		
	}

}
