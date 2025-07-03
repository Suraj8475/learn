package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	static WebDriver driver;
	NavigateToUrl url;
	public static void main(String[] args) {
		
		//CreateNewAccount account = new CreateNewAccount();
		//account.signUp();
	}
	
	public CreateNewAccount() {
		driver = new ChromeDriver();
		url = new NavigateToUrl(driver);
    }
	
	public static void signUp(String firstname, String lastname, String email, String password) throws InterruptedException {
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(1);
		Select dropdown1 = new Select(driver.findElement(By.id("month")));
		dropdown1.selectByValue("3");
		Select dropdown2 = new Select(driver.findElement(By.id("year")));
		dropdown2.selectByValue("2011");
		
		driver.findElement(By.cssSelector("input[name='sex'][value='2']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
		driver.findElement(By.name("websubmit")).click();
        
	}
        //System.out.println("Enter the valid Username in Username textfield:");
        //driver.findElement(By.id("txtPassword")).sendKeys(password);
        //System.out.println("Enter the valid Password in Password textfield:");
        //driver.findElement(By.cssSelector(".btn-primary.btn-lg")).click();
        //System.out.println("Click on LogIn Button");

}
