/*in this program
 * i have created POM class for T_shirt page
 * i will find 4 elements
 * i will utilize using 4 methods(click methods) 
 */
package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_shirt {
	@FindBy(xpath="//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	//                 (//img[@class='img-responsive'])[1]
	private WebElement pic;
	
	@FindBy(xpath="//body//div[@class='application-base']//div//div[1]//div[1]//button[1]")
	private WebElement size;
	
	@FindBy(xpath="//div[contains(text(),'ADD TO BAG')]")
	private WebElement addtobag;
	
	@FindBy(xpath="//span[contains(text(),'Bag')]")
	private WebElement bagbutton;
	
	@FindBy(xpath="//a[contains(.,'Next')]")
	private WebElement Nextbutton;
	
	public T_shirt(WebDriver driver)//constructor with parameters
	{
		PageFactory.initElements(driver, this);
	}
	
	public void picmethod()
	{
	pic.click();	
	}
	public void sizemethod()
	{
		size.click();
	}

	public void addtobagmethod()
	{
		addtobag.click();
	}

	public void bagbuttonmethod()
	{
		bagbutton.click();
	}
	
	public void Nextbuttonmethod()
	{
		Nextbutton.click();
	}


}
