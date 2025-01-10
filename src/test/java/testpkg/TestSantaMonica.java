package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseSantaMonica;
import pagepkg.PageSantaMonica;

public class TestSantaMonica extends BaseSantaMonica {
	@Test
	public void SantaMonica() throws InterruptedException {
		PageSantaMonica ob= new PageSantaMonica(driver);
		Thread.sleep(5000);
		ob.LogoVerification();
		ob.click();
		ob.TabSwitching();
		ob.hoverAndSelectProfile();
		ob.scrollDownAndClick();
		ob.BacktoHomepage();
		ob.findBrokenLinks();
		
	}
	
}
