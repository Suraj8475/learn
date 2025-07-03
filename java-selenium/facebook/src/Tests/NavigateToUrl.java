package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		NavigateToUrl navigate = new NavigateToUrl(new ChromeDriver());
		navigate.navigateUrl();
		
		//login.login();
		//logout();
	}
	public NavigateToUrl(WebDriver driver) {
		this.driver = driver;
    }
	
	public static void navigateUrl() {

        driver.get("https://www.facebook.com/");
        System.out.println("Navigate to the URL: https://www.facebook.com/");
    }

}
