package testScript.AddtoCartTestcase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import pomrepository.DigitalDownloads_Page;
import pomrepository.Shoppingcart_Page;

public class DigitalProduct_AddtocartTestCase extends BaseTest {
	@Test
	public void Verify_user_is_able_To_Add_Product_in_Cart() throws InterruptedException
	{
		home_Page.getBookslink().click();
		
		//validation
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books");
		Reporter.log("Book Page Successfully",true);
		
		//navigate to digital Download page
		
		home_Page.getDigitaldownloadslink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads");
		Reporter.log("Digital Download page successfully",true);
	//adding the product in digital download page	
		DigitalDownloads_Page dd=new DigitalDownloads_Page(driver);
		 List<WebElement> allproducttext = dd.getDigitalAllProductsLink();
		 for (WebElement allpdttext : allproducttext)
		 {
			String textallpdts = allpdttext.getText();
			allproducttext.add(allpdttext);
		}
		 
//performing add to cart
		 List<WebElement> addtocartall = dd.getAddtoCartDigitalButton();
		 for (WebElement addtocartallpdt : addtocartall)
		 {
			addtocartallpdt.click();
			Thread.sleep(1000);
		 }
		 

	// navigate to shopping cart page
			home_Page.getShoppinglink().click();

			Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
				Reporter.log("cart page is Displayed");
				
				
	//gettextfromall products
				Shoppingcart_Page sp=new Shoppingcart_Page(driver);
				 List<WebElement> alldigitalpdt = sp.getAddtoCartDigitalText();
				 
				 for (WebElement allpdt : alldigitalpdt) {
					String digitalpdttext = allpdt.getText();
					alldigitalpdt.add(allpdt);
				}
				 Assert.assertEquals(addtocartall,alldigitalpdt);
				 
					Reporter.log("success");
				 
// remove all the product
				 List<WebElement> allchk = sp.getRemoveFromCartCheckbox();
				 for (WebElement allcheckbox : allchk) {
					allcheckbox.click();
				}
				 sp.getUpdateShoppingCartButton().click();
	}
	

}
