import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class SysMgr {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	String username;
	String password;
	
	@BeforeClass
	public static void browseropenTest()
	{
		System.out.println("IE browser opened");
	}
	
	@AfterClass
	public static void browsercloseTest()
	{
		System.out.println("IE browser closed");
	}
	

	public SysMgr(String user, String pwd)
	{
		username=user;
		password=pwd;
	}
	
	
	@Test
	public void printTest()
	{
		System.out.println(username + password);
	}

	
	@Parameters
	
	public static Collection<String[]> getdata()
	{
		String data[][] = new String[2][2];
		
		data[0][0]="venkat";
		data[0][1]="venkat123";
		data[1][0]="tamil";
		data[1][1]="tamil123";
		
		return Arrays.asList(data);
	}
	
	@Test(timeout=1000)
	public void loginpageTest()
	{
		System.out.println("Successfully Login Page displayed");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("User Logged in to application");
		
		int x,y;
		x=10;
		y=101;
		try {
			Assert.assertEquals(x, y);
		} catch(Error e)
		{
			err.addError(e);
		}
		
		System.out.println("Verification verified");
	}
	
	@Test
	public void homepageTest()
	{
		System.out.println("Landing page displayed");
	}
	
	@Ignore
	@Test
	public void forgetpasswordTest()
	{
		System.out.println("Forget password message notification sent");
	}
	

}
