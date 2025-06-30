package Tests;

public class SendNomalMsg {
	
	public static void main(String[] args) throws InterruptedException {
		
		String phone = Randomize.generateMobileNumber();
		
		SmsMessage sms = new SmsMessage();
		
		LogIn.login();
		SmsOptions.navigateToTheSmsSideBar();
		SmsOptions.navigateSmsSidebarSendSms();
		sms.normalMsg(phone);

	}

}
