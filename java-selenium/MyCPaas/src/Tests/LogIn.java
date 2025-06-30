package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		LogIn login = new LogIn(new ChromeDriver());
		login.login();
		logout();
	}
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
    }
	
//	public static void testLogin(WebDriver driver, String txtUserName, String txtPassword) throws InterruptedException {
//		
//		driver.get("https://mycpaas.com/login.php");
//		System.out.println("Navigate to the URL: https://mycpaas.com/login.php");
//		
//		driver.findElement(By.id("txtUserName")).clear();
//        driver.findElement(By.id("txtPassword")).clear();
//        
//        System.out.println("Enter the valid Username in Username textfield:");
//        driver.findElement(By.id("txtUserName")).sendKeys(txtUserName);
//        
//        System.out.println("Enter the valid Password in Password textfield:");
//        driver.findElement(By.id("txtPassword")).sendKeys(txtPassword);
//        
//        System.out.println("Click on LogIn Button");
//        WebElement btn = driver.findElement(By.cssSelector(".btn-primary.btn-lg"));
//		btn.click();
//	}
	public static void login() {
        
        String username = ConfigReader.get("username");
        String password = ConfigReader.get("password");

        driver.get("https://mycpaas.com/login.php");
        System.out.println("Navigate to the URL: https://mycpaas.com/login.php");

        driver.findElement(By.id("txtUserName")).sendKeys(username);
        System.out.println("Enter the valid Username in Username textfield:");
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        System.out.println("Enter the valid Password in Password textfield:");
        driver.findElement(By.cssSelector(".btn-primary.btn-lg")).click();
        System.out.println("Click on LogIn Button");
    }
	public static void logout() {
		driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.cssSelector(".btn-primary.btn-block")).click();
        System.out.println("Click on LogOut Button");
    }
}
