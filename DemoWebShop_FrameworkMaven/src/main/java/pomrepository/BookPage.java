package pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage 
{
	public BookPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	 
     @FindBy(id="products-orderby")
	 private WebElement sortByDropdown;
     
     @FindBy(id="products-pagesize")
	 private WebElement displayDropdown;
     
     @FindBy(xpath = "//h2[@class='product-title']")
	 private List<WebElement> BooksNamesLink;
     
     @FindBy(xpath="//a[text()='Fiction EX']")
private WebElement fictionex;  
     @FindBy(linkText = "Computing and Internet")
     private WebElement ComputingandInternet;
    

	public WebElement getComputingandInternet() {
		return ComputingandInternet;
	}

	public WebElement getFictionex() {
		return fictionex;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public List<WebElement> getBooksNamesLink() {
		return BooksNamesLink;
	}

	
     
}

