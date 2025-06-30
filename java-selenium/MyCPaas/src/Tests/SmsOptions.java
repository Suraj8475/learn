package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmsOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		
	}
	public SmsOptions(WebDriver driver) {
		this.driver = driver;
    }
	
	public static void navigateToTheSmsSideBar() throws InterruptedException {
		driver.findElement(By.className("dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("select-btn")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(sideBarLinksXPath("Contacts"))).click();
		
		//driver.findElement(By.xpath(sideBarLinksXPath("Accessories Items"))).click();
	}
	public static void navigateSmsSidebarContacts() {
		
		driver.findElement(By.xpath(sideBarLinksXPath("Contacts"))).click();
	}
	
	public static void navigateSmsSidebarAccessoriesItems() throws InterruptedException {
		
		driver.findElement(By.xpath(sideBarLinksXPath("Accessories Items"))).click();
	}
	
	public static void navigateSmsSidebarSendSms() throws InterruptedException {
		
		driver.findElement(By.xpath(sideBarLinksXPath("Send SMS"))).click();
	}
	
	public static String sideBarLinksXPath(String tooltip) {
		return String.format("//ul[not(contains(@style, 'display:none'))]//a[@data-tooltip='%s']", tooltip);
	}

}
