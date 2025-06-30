package Tests;

public class DltEntityCreation {

	public static void main(String[] args) throws InterruptedException {
		String id12digit = Randomize.generate12DigitId();
		
		SmsAccessoriesItems accessoriesitem = new SmsAccessoriesItems();
		
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarAccessoriesItems();
		accessoriesitem.dltEntity();
		accessoriesitem.CreateEntityId(id12digit, "Ok");
		
	}
}
