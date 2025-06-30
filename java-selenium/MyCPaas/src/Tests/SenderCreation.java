package Tests;

public class SenderCreation {

	public static void main(String[] args) throws InterruptedException {
		
		String senderid = Randomize.generateSenderId();
		
		SmsAccessoriesItems accessoriesitem = new SmsAccessoriesItems();
		
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarAccessoriesItems();
		accessoriesitem.clickOnSender();
		accessoriesitem.senderId(senderid);
		
	}

}
