/*i have created POM class for Home_page(myntra)
 * it has 2 elements in this page
 * it has mouseover action and click method
 * this page navigate to tshirts page(T_shirt.java)
 */
package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	//=================================================
	//declaration(find elements=2 elements in this page)
	@FindBy(xpath = "//a[.='Men']")
	private WebElement men;
	
	@FindBy(xpath="//a[.='T-Shirts']")//tshirts dropdown
	private WebElement tshirt;
	//=================================================
	//initialization(COMMON)
	public Home_page(WebDriver driver)//constructor with parameters
	{
		PageFactory.initElements(driver, this);
	}
	//=================================================
	//utilization(2 elements=2 methods)
	public void MouseOverOnMen(WebDriver driver)
	//method for men tab(action-perform)
	{
		Actions act = new Actions(driver);
		//Actions act=new Actions(driver);
		act.moveToElement(men).perform();
	}
	public void ClickTshirt()
	//method for tshirt(only click)
	{
		tshirt.click();
	}
	//=================================================
}
