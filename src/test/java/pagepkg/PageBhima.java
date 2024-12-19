package pagepkg;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBhima {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div")
	WebElement Field;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div/div/div[2]/div[3]/div")
	WebElement AccountOption;
	
	@FindBy(xpath = "//*[@id=\"userName\"]")
	WebElement MobileNumberField;
	
	@FindBy(xpath = "//*[@id=\"pword\"]")
	WebElement EnterPasswordField;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[3]/div/div/div/div[1]/a[5]/div/p")
	WebElement CoinOption;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div[2]/div/button/span/p")
	WebElement Filters;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[1]/div/div/div/div/span")
	WebElement PriceFilter;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[1]/div/div/div[2]/div/div/ul/li[3]/div/span/p")
	WebElement SelectedPriceRange;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[2]/div/div/div/div/span")
	WebElement MetalFilter;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[2]/div/div/div[2]/div/div/ul/li[1]/div/span/p")
	WebElement Gold;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[1]/div/div/div[1]/div/span")
	WebElement ClosePrice;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/ul/div[2]/div/div/div[1]/div/span")
	WebElement MetalClose;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/button[2]/span[1]")
	WebElement ApplyFilter;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div[3]/div/a/div/div[1]/div/img")
	WebElement SelectedCoin;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[6]/div/button/span[1]")
	WebElement AddToCart;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div/div/div[2]/div[4]/a/div/img")
	WebElement ViewCart;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/h2/div/div/div/img")
	WebElement CloseAddressPopUP;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/img")                  
	WebElement RemoveFromCart;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[3]/button/span[1]")
	WebElement ConfirmRemoval;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/div/button")
	WebElement BackToHomeButton;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/a/div/img")
	WebElement StoresButton;
	
	public  PageBhima(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login() {
		AccountOption.click();
		MobileNumberField.sendKeys(("6235124981"));
		MobileNumberField.sendKeys(Keys.ENTER);
		EnterPasswordField.sendKeys("Febibhima");
		EnterPasswordField.sendKeys(Keys.ENTER);
		
	}
	

	private void waitFor(int milliseconds)
	{ 
		try
	{ 
			Thread.sleep(milliseconds); 
	} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	}
	
	public void FilterSelections() {
		CoinOption.click();
		waitFor(2000);
		Filters.click();
		waitFor(2000);
		PriceFilter.click();
		waitFor(2000);
		SelectedPriceRange.click();
		waitFor(2000);
		MetalFilter.click();
		waitFor(2000);
		Gold.click();
		waitFor(2000);
		ClosePrice.click();
		waitFor(2000);
		MetalClose.click();
		waitFor(2000);
		ApplyFilter.click();
		waitFor(2000);
	}
	
	public void Purchasing() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectedCoin.click();
		AddToCart.click();
		ViewCart.click();
		CloseAddressPopUP.click();
		RemoveFromCart.click();
		ConfirmRemoval.click();
		BackToHomeButton.click();
	}
	
	public void StoreLocating1() {
		StoresButton.click();
	}
	
	

}
