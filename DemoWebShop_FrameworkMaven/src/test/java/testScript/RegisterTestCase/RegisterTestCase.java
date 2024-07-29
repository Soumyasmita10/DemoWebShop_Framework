package testScript.RegisterTestCase;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import pomrepository.RegisterPage;

public class RegisterTestCase  extends BaseTest{
	
	@Test(groups = "functional" ,dataProvider = "RegisterData")
	public void verify_User_Is_Able_To_Register(String firstName,String lastName,String email,String password,String conFirmPassword) throws EncryptedDocumentException, IOException
	{
		
		String modEmail=new Random().nextInt(3000)+email;
		System.out.println(modEmail);
		
		//logout the webpage
		home_Page.getLogoutLink().click();
		
		
		RegisterPage register_page=new RegisterPage(driver);
		register_page.getRegisterLink().click();
		
		
		//validation for register page
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register");
			Reporter.log("Register page is Displayed.",true);
		//entering the data
		
		register_page.getFemaleRadio().click();
		register_page.getFirstNameTextField().sendKeys(firstName);
		register_page.getLastNameTextField().sendKeys(lastName);
		register_page.getEmailTextField().sendKeys(modEmail);
		register_page.getPwdTextField().sendKeys(password);
		register_page.getConfpwdTextField().sendKeys(conFirmPassword);
		register_page.getRegisterButton().click();
		
		 //validation
		 String message = register_page.getCompletedmsg().getText();
			
		 Assert.assertEquals(message,"Your registration completed");
				Reporter.log("Register succesful",true);
	    
	}
     @DataProvider(name="RegisterData")
	public Object[][] dataSupply() throws EncryptedDocumentException, IOException
	{
		return data_Utility.getMultipleDataFromExcel("RegisterData");
	}

	

}
