package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="Email")
  private WebElement emailTextField;
  
	@FindBy(css="input[id='Password']")
  private WebElement passwordTextField;
  
	@FindBy(xpath="//input[@class='button-1 login-button']")
  private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmailTextField()
	 {
		return  emailTextField;
	 }
	public WebElement getPasswordTextField()
	 {
		return  passwordTextField;
	 }
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}
