package Tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmsMessage {
	static WebDriver driver;
	LogIn login;
	SmsOptions smsOptions;
	
	public SmsMessage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		login = new LogIn(driver);
		smsOptions = new SmsOptions(driver);
		
    }
	
	public static void normalMsg(String textArea) throws InterruptedException {
		
		Select dropdown1 = new Select(driver.findElement(By.id("ddlSender")));
		Thread.sleep(1000);
		dropdown1.selectByIndex(2);
		
		Select dropdown2 = new Select(driver.findElement(By.id("ddlCategory")));
		dropdown2.selectByIndex(0);
		
		driver.findElement(By.id("txtMobile")).sendKeys(textArea);
		
		//driver.findElement(By.linkText("Select from Phonebook")).click();
		
		driver.findElement(By.id("cmdTemplate")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myTable")));
		driver.findElement(By.id("rw0")).click();
        
        driver.findElement(By.id("cmdSelect")).click();
        
        driver.findElement(By.id("cmdSubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("cmdSubmitRequest")).click();
	}

}
