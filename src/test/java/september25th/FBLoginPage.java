package september25th;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage extends Base {

	public FBLoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement user;

	@FindBy(id = "pass")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
