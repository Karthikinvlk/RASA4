package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_scenario3 {
	//GLOBAL VARIABLE
		WebDriver driver;
		//==================================
		@BeforeMethod
		public void openbrowser()
		{
			System.setProperty("webdriver.chrome.driver"
					,"./Driversfolder/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.myntra.com");
		}
		//==================================
		@Test
		public void ClickNextButton()
		{
			//PAGE-1========================
			Home_page h1=new Home_page(driver);
			h1.MouseOverOnMen(driver);
			h1.ClickTshirt();
			
			//PAGE-2========================
			T_shirt t1=new T_shirt(driver);
			t1.Nextbuttonmethod();
		}
}
