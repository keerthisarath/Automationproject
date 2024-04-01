package testpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Homepage;

public class Hometest extends Basecls {
	
	@Test
	public void titleverification()
	{
		String expected="Lenskart";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	@Test
	public void test1() throws Exception
	{
		Homepage ob=new Homepage(driver);
		

		
		ob.searchbtn();
		ob.pdt2();
		ob.clickglass();
		
		ob.sort();
		ob.product();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				ob.selectlens();
			driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		
		ob.repeat();
		
	

}
}
