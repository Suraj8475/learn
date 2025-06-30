package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DltTemplateCreation {
	
	public static void main(String[] args) throws InterruptedException {
		
		String id12digit = Randomize.generate12DigitId();
		
		SmsAccessoriesItems accessoriesitem = new SmsAccessoriesItems();
		
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarAccessoriesItems();
		accessoriesitem.dltTemplate();
		accessoriesitem.addTemplate(id12digit, "Test", "Ram Ram");
		
	}

}
