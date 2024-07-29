package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppinglink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement Bookslink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement Computerslink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	private WebElement Electronicslink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement ApparelShoeslink;

	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement GiftCardslink;

	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
	private WebElement Jewelrylink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement Digitaldownloadslink;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(id="small-searchterms")
	private WebElement Searchtextfield;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}

	public WebElement getShoppinglink() {
		return shoppinglink;
	}

	public void setShoppinglink(WebElement shoppinglink) {
		this.shoppinglink = shoppinglink;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public void setWishlist(WebElement wishlist) {
		this.wishlist = wishlist;
	}

	public WebElement getBookslink() {
		return Bookslink;
	}

	public void setBookslink(WebElement bookslink) {
		Bookslink = bookslink;
	}

	public WebElement getComputerslink() {
		return Computerslink;
	}

	public void setComputerslink(WebElement computerslink) {
		Computerslink = computerslink;
	}

	public WebElement getElectronicslink() {
		return Electronicslink;
	}

	public void setElectronicslink(WebElement electronicslink) {
		Electronicslink = electronicslink;
	}

	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}

	public void setApparelShoeslink(WebElement apparelShoeslink) {
		ApparelShoeslink = apparelShoeslink;
	}

	public WebElement getGiftCardslink() {
		return GiftCardslink;
	}

	public void setGiftCardslink(WebElement giftCardslink) {
		GiftCardslink = giftCardslink;
	}

	public WebElement getJewelrylink() {
		return Jewelrylink;
	}

	public void setJewelrylink(WebElement jewelrylink) {
		Jewelrylink = jewelrylink;
	}

	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}

	public void setDigitaldownloadslink(WebElement digitaldownloadslink) {
		Digitaldownloadslink = digitaldownloadslink;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getSearchtextfield() {
		return Searchtextfield;
	}

	public void setSearchtextfield(WebElement searchtextfield) {
		Searchtextfield = searchtextfield;
	}






}
