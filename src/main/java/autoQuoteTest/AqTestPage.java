package autoQuoteTest;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagesPackage.ProductsPage;

public class AqTestPage extends BaseClass {
	ProductsPage products;

	@BeforeMethod
	public void initElemet() {
		productsPage = new ProductsPage(driver);
	}

	@Test
	public void AqTestpage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(productsPage.autoButton));

		wait.until(ExpectedConditions.visibilityOf(productsPage.zipCodeText));
		String zipCodeText = productsPage.zipCodeText.getText();
		System.out.println(">>>>>>>>>>>>>>>>" + zipCodeText);

	}

}
