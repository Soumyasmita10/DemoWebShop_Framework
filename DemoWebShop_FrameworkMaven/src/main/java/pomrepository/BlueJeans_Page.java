package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueJeans_Page {
	public BlueJeans_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addTocart;
	@FindBy(linkText = "Blue Jeans")
	private WebElement blueJeansText;
	
	public WebElement getBlueJeansText() {
		return blueJeansText;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}

}
