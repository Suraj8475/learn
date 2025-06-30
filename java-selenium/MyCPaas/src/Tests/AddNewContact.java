package Tests;

public class AddNewContact {

	public static void main(String[] args) throws InterruptedException {
		String phone = Randomize.generateMobileNumber();
		String name = Randomize.generateName();
		
		SmsContactInfo contactinfo = new SmsContactInfo();
		
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarContacts();
		contactinfo.phoneBook();
		contactinfo.CreateContact(phone, name);

	}

}
