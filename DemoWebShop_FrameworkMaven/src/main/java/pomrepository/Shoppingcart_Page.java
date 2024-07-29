package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class Shoppingcart_Page 
	{
		@FindBy(xpath="//a[@class='product-name']")
		 private List<WebElement> addtoCartDigitalText;
		
		@FindBy(xpath="//input[@name='removefromcart']")
		 private List<WebElement> removeFromCartCheckbox;
		  
		@FindBy(xpath="//input[@value='Update shopping cart']")
		 private WebElement updateShoppingCartButton;
		
		@FindBy(xpath = "//a[text()='Blue Jeans' and @class='product-name']/../..//input[contains(@class,'qty-input')]")
		private WebElement quantity;
		
		public WebElement getQuantity() {
			return quantity;
		}

		public WebElement getProductname() {
			return productname;
		}

		@FindBy(xpath = "//td[@class='product']//a[text()='Computing and Internet']")
		private WebElement productname;
		
		@FindBy(xpath = "//input[@name='removefromcart']")
		private WebElement checkBox;
		
		public WebElement getCheckBox() {
			return checkBox;
		}

		public Shoppingcart_Page(WebDriver driver)
	    {
	 	   PageFactory.initElements(driver, this);
	    }

		public List<WebElement> getAddtoCartDigitalText() {
			return addtoCartDigitalText;
		}

		public List<WebElement> getRemoveFromCartCheckbox() {
			return removeFromCartCheckbox;
		}

		public WebElement getUpdateShoppingCartButton() {
			return updateShoppingCartButton;
		}

		
		  
	}


