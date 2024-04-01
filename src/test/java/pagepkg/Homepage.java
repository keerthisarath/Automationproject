package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div[2]/div/form/input")
	WebElement search;
	 
	@FindBy(id="lrd11")
	WebElement kidsglass;
	
	@FindBy(xpath="//*[@id=\"204382\"]/a/div[2]/img")
	WebElement firstglass;
	
	@FindBy(xpath="//*[@id=\"suited_for_id\"]/div[2]/div/div[2]/label/div")
	WebElement age;
	
	@FindBy(xpath="//*[@id=\"suited_for_id\"]/div[2]/div/div[3]/label/div")
	WebElement agegroup;
	
	@FindBy(xpath="//*[@id=\"filter-item-image-0\"]/div/div[1]/img")
	WebElement frametype;
	
	@FindBy(xpath="//*[@id=\"try-on-section\"]/div[3]/select")
	WebElement dropdown;

	@FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[3]/p[1]")
	WebElement pdt1;
    
    @FindBy(xpath="//button[@id='btn-primary']")
	WebElement lens;
    
    @FindBy(xpath="//*[@id=\"single_vision\"]/div[2]/div[1]")
	WebElement lenstype;
	
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/*[1]")
	WebElement aviator1;
    
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]")
	WebElement aviator2;
 
    @FindBy(xpath=" //*[@id=\"package-card-wrapper\"]/div/div[1]/div")
	WebElement lenspackage; 
    
    @FindBy(xpath="//*[@id=\"modal-portal\"]/div[8]/div/div[2]/div[3]/div[2]/button/div[1]")
	WebElement continuebtn; 
	
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/*[1]")
	WebElement cart;
    
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[3]/span[1]")
   	WebElement filterage;
  
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/span[1]")
	WebElement filterage2;
    
    @FindBy(xpath="//body/div[@id='__next']/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/aside[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]")
   	WebElement agenew; 

   	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchbtn()
    {
    	search.sendKeys("aviator");  
    	search.sendKeys(Keys.ENTER);   	}

	public void pdt2()
    {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		
		aviator1.click();
		aviator2.click();
    	
   	}
	
	public void clickglass()
	{
		kidsglass.click();
		age.click();
		agegroup.click();
		frametype.click();
	          
	}
	 public void product() throws Exception 
	 {
		filterage.click(); 
		Thread.sleep(3000);
		filterage2.click();
		Thread.sleep(3000);
		agenew.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		pdt1.click();
	 }
	public void sort()
	{
		Select drop=new Select(dropdown);
		drop.selectByValue("low_price");
	
		
	}
	public void selectlens() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-primary']"))).click();

		lenstype.click();
		Thread.sleep(3000);
		lenspackage.click();
		Thread.sleep(3000);
		continuebtn.click();
	}
	
	
	public void repeat()
	{
		cart.click();
		
		
	}
}
