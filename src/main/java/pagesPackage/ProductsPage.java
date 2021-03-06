package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "(//a[contains(.,'Auto')])[1]")
	public WebElement autoButton;
	@FindBy(xpath = "//label[@for='zipCode_overlay' and text()='Enter ZIP Code']")
	public WebElement zipCodeText;
	
	
	
}
