package september25th;

public class Sample extends Base{
	public static void main(String[] args) {
		
		browserLaunch();
		maximize();
		
		FBLoginPage login = new FBLoginPage();
		login.getUser().sendKeys("kishore");
		login.getPass().sendKeys("12345");
		login.getLoginBtn().click();
	}

}
