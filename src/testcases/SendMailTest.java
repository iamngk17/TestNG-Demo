package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;

public class SendMailTest extends AppUtils
{
	@Parameters({"email","subject"})
	@Test
	public void sendMail(String email,String subject) 
	{
		System.out.println("Mail send to:"+email +"with subject:"+subject);
		
	}

}
