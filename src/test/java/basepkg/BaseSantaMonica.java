package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseSantaMonica {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
