package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseBhima;
import pagepkg.PageBhima;

public class TestBhima extends BaseBhima{
	@Test
	public void Clicks() {
		PageBhima ob=new PageBhima(driver);
		ob.Login();
		ob.FilterSelections();
		ob.Purchasing();
		ob.StoreLocating1();
	}
	

}
