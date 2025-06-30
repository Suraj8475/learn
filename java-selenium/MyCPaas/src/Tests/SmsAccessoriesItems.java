package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmsAccessoriesItems {
	
	static WebDriver driver;
	LogIn login;
	SmsOptions smsOptions;

	public SmsAccessoriesItems() {
		driver = new ChromeDriver();
		login = new LogIn(driver);
		smsOptions = new SmsOptions(driver);
    }
	
	public static void dltEntity() throws InterruptedException {
		
		driver.findElement(By.linkText("DLT Entity")).click();
		
		driver.findElement(By.linkText("Add Entity")).click();
	}
	
	public static void CreateEntityId(String randomEntityId, String remark) {
		
		driver.findElement(By.id("txtEntity")).sendKeys(randomEntityId);
		
		driver.findElement(By.id("txtRemark")).sendKeys(remark);
		
		driver.findElement(By.id("cmdSubmit")).click();

		driver.findElement(By.cssSelector(".bs-canvas-close.close")).click();
		
		driver.findElement(By.linkText("Back")).click();
		
	}
	
	public static void clickOnSender() throws InterruptedException {
		
		driver.findElement(By.linkText("Sender")).click();
		
		driver.findElement(By.linkText("Add Sender")).click();
	}
	
	public static void senderId(String sender) throws InterruptedException {

	    driver.findElement(By.xpath("//button[@data-id='ddlEntityAdd']")).click();
	    driver.findElement(By.cssSelector("div.dropdown-menu.show ul.dropdown-menu.show li:last-child")).click();
		driver.findElement(By.id("txtSender")).sendKeys(sender);
		Thread.sleep(1000);
		driver.findElement(By.id("cmdSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bs-canvas-close.close")).click();
		driver.findElement(By.linkText("Back")).click();
	}
	
	public static void dltTemplate() throws InterruptedException {
		
		driver.findElement(By.linkText("DLT Template")).click();
		
		driver.findElement(By.linkText("Add Template")).click();
	}
	
	public static void addTemplate(String randomTemplateId, String title, String messagebox) throws InterruptedException {
		
		Select dropdown1 = new Select(driver.findElement(By.id("ddlEntity")));
		dropdown1.selectByIndex(2);
		Thread.sleep(1000);
		Select dropdown2 = new Select(driver.findElement(By.id("ddlSender")));
		dropdown2.selectByIndex(1);
		Thread.sleep(1000);
		Select dropdown3= new Select(driver.findElement(By.id("txtTemplateCategory")));
		dropdown3.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id("txtTemplateId")).sendKeys(randomTemplateId);
		Thread.sleep(1000);
		driver.findElement(By.id("txtTitle")).sendKeys(title);
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".custom-controls.checkbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtMessage")).sendKeys(messagebox);
		Thread.sleep(1000);
		driver.findElement(By.id("cmdAdd")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bs-canvas-close.close")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Back")).click();
		
	}

}
