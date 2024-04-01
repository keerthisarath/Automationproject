package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Loginpage;

public class Logintest extends Basecls {
	
	@Test 
	public void test2()
	{
		Loginpage ob=new Loginpage(driver);
		ob.signinbutton();	
	}

}
