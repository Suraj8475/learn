package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmsContactInfo {
	static WebDriver driver;
	LogIn login;
	SmsOptions smsOptions;

	public SmsContactInfo() {
		driver = new ChromeDriver();
		login = new LogIn(driver);
		smsOptions = new SmsOptions(driver);
    }
	
//	public static void main(String[] args) throws InterruptedException{
//		SmsContactInfo contactinfo = new SmsContactInfo();
//		LogIn.login();
//		SmsOptions.navigateToTheSmsSideBar();
//		SmsOptions.navigateSmsSidebarContacts();
//		createGroup();
//		groupName("public");	
//	}

	public static void createGroup() throws InterruptedException {
		driver.findElement(By.linkText("Groups")).click();
		driver.findElement(By.linkText("Add Group")).click();
	}

	public static void groupName(String txtgroupName) throws InterruptedException {
		driver.findElement(By.id("txtgroupName")).sendKeys(txtgroupName);
		Thread.sleep(1000);
		driver.findElement(By.id("cmdSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bs-canvas-close.close")).click();
		driver.findElement(By.linkText("Back")).click();
	}
	
	public static void phoneBook() throws InterruptedException {
		
		driver.findElement(By.linkText("Phonebook")).click();
		
		driver.findElement(By.id("singleAdd")).click();
	}
	
	public static void CreateContact(String randomMobile, String txtName) {
		Select dropdown = new Select(driver.findElement(By.id("ddlGroup")));
		dropdown.selectByIndex(1);
		//sideBarLinksXPath
		driver.findElement(By.id("txtMobile")).sendKeys(randomMobile);
		
		driver.findElement(By.id("txtName")).sendKeys(txtName);
		
		driver.findElement(By.id("cmdAdd")).click();
		
		//driver.findElement(By.cssSelector(".bs-canvas-close.close")).click();
		
		driver.findElement(By.linkText("Back")).click();
		
	}
	
	public static String sideBarLinksXPath(String tooltip) {
		return String.format("//ul[not(contains(@style, 'display:none'))]//a[@data-tooltip='%s']", tooltip);
	}
}
