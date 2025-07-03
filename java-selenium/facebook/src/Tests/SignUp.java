package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//SignUp signup = new SignUp();
		//NavigateToUrl navigate = new NavigateToUrl(new ChromeDriver());
		CreateNewAccount account = new CreateNewAccount();
		
		NavigateToUrl.navigateUrl();
		Thread.sleep(1000);
		account.signUp("Suraj", "Automation", "automationsuraj4@gmail.com", "Radhe@123");

	}

}
