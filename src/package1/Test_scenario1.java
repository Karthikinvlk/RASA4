/*this is the test class
 * ==============
 * @beforemethod
 * (open browser)
 * ==============
 * @test
 * create object and call methods (each page)
 * (used switchto in or-each loop)
 * ==============
 * @aftermethod
 * (close browser)
 * ==============
 */
package package1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_scenario1 {
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
	public void VerifyCartIsEmpty()
	{
		//PAGE-1========================
		Home_page h1=new Home_page(driver);
		h1.MouseOverOnMen(driver);
		h1.ClickTshirt();
		
		//PAGE-2========================
		T_shirt t1=new T_shirt(driver);
		t1.picmethod();
		//move to new page here
		//-----------------------------
		Set<String> d1 = driver.getWindowHandles();
		for(String d2:d1)
		{
			driver.switchTo().window(d2);
		}
		//-----------------------------
		t1.sizemethod();
		t1.addtobagmethod();
		t1.bagbuttonmethod();
		
		//PAGE-3========================
		Cart_page c1=new Cart_page(driver);
		c1.rem1method();
		c1.verification();
		c1.rem2method();
		
	}
	//==================================
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();		
	}
	//==================================
}
