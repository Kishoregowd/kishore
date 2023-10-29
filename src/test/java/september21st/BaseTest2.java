package september21st;

import september25th.FBLoginPage;

public class BaseTest2 extends BaseTest {
	public static void main(String[] args) {

		browserLaunch();

		maximize();

		FBLoginPage login = new FBLoginPage();
		login.getUser().sendKeys("kishore");
		login.getPass().sendKeys("122354");
		login.getLoginBtn().click();
		
	}

}
