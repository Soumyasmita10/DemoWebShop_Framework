package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	@FindBy(id="gender-female")
	private WebElement femaleRadio;
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	@FindBy(id="Email")
	private WebElement emailTextField;
	@FindBy(id="Password")
	private WebElement pwdTextField;
	@FindBy(id="ConfirmPassword")
	private WebElement confpwdTextField;
	@FindBy(xpath="//div[@class='result']")
	private WebElement completedmsg;
	@FindBy(id="register-button")
	private WebElement registerButton;




	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getCompletedmsg() {
		return completedmsg;
	}
	public void setCompletedmsg(WebElement completedmsg) {
		this.completedmsg = completedmsg;
	}
	public WebElement getRegisterLink() 
	{
		return registerLink;
	}
	public WebElement getFemaleRadio()
	{
		return femaleRadio;
	}
	public WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() 
	{
		return lastNameTextField;
	}
	public WebElement getEmailTextField()
	{
		return emailTextField;
	}
	public WebElement getPwdTextField()
	{
		return pwdTextField;
	}
	public WebElement getConfpwdTextField()
	{
		return confpwdTextField;
	}

}
