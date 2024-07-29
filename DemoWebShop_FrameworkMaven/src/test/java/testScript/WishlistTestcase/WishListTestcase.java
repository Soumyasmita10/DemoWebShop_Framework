package testScript.WishlistTestcase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import pomrepository.BookPage;
import pomrepository.FictionExPage;
import pomrepository.WishlistPage;

public class WishListTestcase  extends BaseTest{
	@Test
	public void Verify_user_is_able_To_Add_Product_To_Wishlist()
	{
		home_Page.getBookslink().click();
		//validation
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books");
		Reporter.log("Book Page Successfully",true);
		
		//navigate to product page
		BookPage book_Page=new BookPage(driver);
		String expProductName = book_Page.getFictionex().getText();
		book_Page.getFictionex().click();
		
		//validation
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX");
			Reporter.log("Fiction Page Successfully",true);
		
		
		FictionExPage product_Page=new FictionExPage(driver);
		product_Page.getAddtoWishListButton().click();
		
		home_Page.getWishlist().click();
		//validation
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Wishlist");
		Reporter.log("Wishlist Page Successfully",true);
		
		driver.navigate().refresh();
		
		WishlistPage wishList_Page=new WishlistPage(driver);
		 String actProductName=wishList_Page.getFictionExWishListText().getText();
		 
		 Assert.assertEquals(expProductName,actProductName);
			 System.out.println("Verify_user_is_able_To_Add_Product_To_Wishlist is  pass");
		List<WebElement> allRemoveCheckBox = wishList_Page.getRemoveBooksFromcart();
		for( WebElement checkBox :allRemoveCheckBox)
		{
			checkBox.click();
		}
		wishList_Page.getUpdateWishlistButton().click();
		
	}

}
