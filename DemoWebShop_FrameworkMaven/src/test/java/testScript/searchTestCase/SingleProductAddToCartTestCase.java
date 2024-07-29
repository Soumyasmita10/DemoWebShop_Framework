package testScript.searchTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import pomrepository.BookPage;
import pomrepository.ComputingPage;
import pomrepository.Shoppingcart_Page;

public class SingleProductAddToCartTestCase  extends BaseTest{
	@Test
	public void Verify_user_is_able_To_Add_Product_in_Cart()
	{
		home_Page.getBookslink().click();
		
		//validation
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books");
		Reporter.log("Book Page Successfully",true);
		
		
		
		//  navigate to product page
		BookPage book_Page=new BookPage(driver);
		String expproduct = book_Page.getComputingandInternet().getText();
		book_Page.getComputingandInternet().click();
		
		//validation 
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computing and Internet");
			Reporter.log("Computing and Internet Page Successfully");
		
		// add to cart
		
		ComputingPage cp=new ComputingPage(driver);
		cp.getAddtocartButton().click();
		
		//navigate to shoppingcart page
		home_Page.getShoppinglink().click();
		
		//Validation
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
			Reporter.log("cart Page Successfully",true);
		
		Shoppingcart_Page sp=new Shoppingcart_Page(driver);
		String actualProductname = sp.getProductname().getText();
		
		//validation
		Assert.assertEquals(expproduct,actualProductname);
		Reporter.log("addtocart test case pass",true);
		//select the check box
		sp.getCheckBox().click();
		
		sp.getUpdateShoppingCartButton().click();
		
		}

}
