import org.junit.BeforeClass;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Jtwo {
	
	String username;
	String password;
	
	public Jtwo(String user, String pwd)
	{
		username=user;
		password=pwd;
	}
	
	@Test
	public void printTest()
	{
		System.out.println(username + "---"+password);
	}
	
	@BeforeClass
	public static void browserOpen()
	{
		System.out.println("IE Browser languged");
	}
	
	@AfterClass
	public static void browserClose()
	{
		System.out.println("IE browser Closed");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("LoggedIn successfully");
	}
	
	@Test
	public void forgetPasswordTest()
	{
		System.out.println("Forget password option");
	}
	
	@Parameters
	public static Collection<String[]> getdata()
	{
		
		String data[][]=new String[2][2];
		
		data[0][0]="venkat";
		data[0][1]="venkat123";
		data[1][0]="tamil";
		data[1][1]="tamil123";
		
		return Arrays.asList(data);
		
	}
	
	

}
