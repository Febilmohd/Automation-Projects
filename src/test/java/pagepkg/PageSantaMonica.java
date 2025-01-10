package pagepkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSantaMonica {

	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"logo-img\"]")
	WebElement Logo;
	
	@FindBy(tagName = "a")
	List<WebElement> Links;
	
	@FindBy(xpath = "//*[@id=\"menu-item-1128\"]/a")
	WebElement FindCourse;
	
	@FindBy(xpath = "//*[@id=\"menu-item-53\"]/a")
	WebElement AboutUs;
	
	@FindBy(xpath = "//*[@id=\"menu-item-82\"]/a")
	WebElement Profile;
	
	@FindBy(xpath = "//*[@id=\"menu-item-1797\"]/a")
	WebElement Careers;
	
	@FindBy(xpath = "//*[@id=\"menu-item-42\"]/a")
	WebElement HomeButton;
	
	
	public  PageSantaMonica(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LogoVerification() {
		if(Logo.isDisplayed()) {
			System.out.println("The Logo is Present on WebPage");
		}
		else {
			System.out.println("The Logo is not Present on Webpage");
		}
	}
	

	public void click() {
		FindCourse.click();
		
	}
	
	public void TabSwitching() {
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		System.out.println("Total tabs opened : "+tabs.size());
		if(tabs.size()>1) {
			driver.switchTo().window(tabs.get(1));
			System.out.println("switched to next Tab . Title : "+driver.getTitle());
			driver.close();
			System.out.println("second tab closed");
			
			driver.switchTo().window(tabs.get(0));
		}
		}
	
	public void hoverAndSelectProfile() {
		Actions actions=new Actions(driver);
		
		actions.moveToElement(AboutUs).perform();
		Profile.click();
	}
	
	public void scrollDownAndClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Careers);
        Careers.click();
	}
	
	public void BacktoHomepage() {
		 HomeButton.click();
	 }
	
	
	 public void findBrokenLinks() {
	        System.out.println("Checking for broken links...");
	        int brokenLinkCount = 0;

	        for (WebElement link : Links) {
	            String url = link.getAttribute("href");
	            if (url == null || url.isEmpty()) {
	                System.out.println("Invalid link: " + link.getText() + " (No href attribute)");
	                continue;
	            }

	            try {
	                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();
	                int responseCode = connection.getResponseCode();

	                if (responseCode >= 400) {
	                    System.out.println("Broken link: " + url + " (Status: " + responseCode + ")");
	                    brokenLinkCount++;
	                } 
	            } catch (Exception e) {
	                System.out.println("Error checking link: " + url + " (Error: " + e.getMessage() + ")");
	            }
	        }
	        System.out.println("Total broken links: " + brokenLinkCount);
	    }
	 
}

	
	
	        

