package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputingPage {
	public ComputingPage(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }
	@FindBy(id = "add-to-cart-button-13")
	private WebElement AddtocartButton;
	
	
	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}

}
