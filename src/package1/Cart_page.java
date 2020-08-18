/*in this page
 * i will create a pom class
 * it has 2 elemets=2 methods(click method)
 * i will verify the cart clearance
 */
package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart_page {
	@FindBy(xpath="//button[@class='inlinebuttonV2-base-actionButton itemContainer-base-inlineButton removeButton']")
	private WebElement rembutton1;
	
	@FindBy(xpath="//button[@class='inlinebutton-base-actionButton itemComponents-base-move itemComponents-base-inlineButton']")
	private WebElement rembutton2;
	
	public Cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void rem1method()
	{
		rembutton1.click();		
	}
	public void rem2method()
	{
		rembutton2.click();
	}
	public void verification()
	{//REM2BUTTON (line 19) is displayed in th page means the cart is empty
		Assert.assertTrue(rembutton2.isDisplayed(),"CART IS EMPTY");
	}
}
