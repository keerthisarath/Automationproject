package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	WebElement signin;
	
	@FindBy(name="emailOrPhone")
	WebElement email;
	
	@FindBy(id="remove-button")
	WebElement signinbtn;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	WebElement password;
	
	@FindBy(xpath="//button[@id='remove-button']")
	WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signinbutton()
	{
		signin.click();
		email.sendKeys("keerthimohanj1994@gmail.com");
		signinbtn.click();
		password.sendKeys("1234567");
		login.click();
	}
}
