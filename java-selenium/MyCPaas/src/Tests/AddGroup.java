package Tests;

public class AddGroup {

	public static void main(String[] args) throws InterruptedException {
		SmsContactInfo contactinfo = new SmsContactInfo();
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarContacts();
		contactinfo.createGroup();
		contactinfo.groupName("public");

	}

}
