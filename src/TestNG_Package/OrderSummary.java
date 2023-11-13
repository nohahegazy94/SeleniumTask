package TestNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

@Listeners(TestNG_Package.Listeners.class)
public class OrderSummary {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Constants ConstantObj = new Constants();
	WebElement element;
	Actions actions;

	@BeforeClass
	public void intializtion() {
		driver.get(ConstantObj.Website_URL);

		if (driver.getCurrentUrl().contains("ar")) {
			String English_URL;
			English_URL = driver.getCurrentUrl().replace("ar", "en");
			driver.get(English_URL);
		}
	}

	@Test(dataProvider = "getCountry", dataProviderClass = Constant_Countries.class)
	public void Validate_Lite_Subscription_Flow_is_Working_Successfully(String URL, String Country) {

		driver.get(URL);
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,400)", "");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#lite-selection")));

		driver.findElement(By.cssSelector("#lite-selection")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PaymentHeader)));

		driver.findElement(By.cssSelector(ConstantObj.PaymentOption));
		driver.findElement(By.cssSelector(ConstantObj.OrderSummaryTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardOption));
		driver.findElement(By.cssSelector(ConstantObj.PaymentMethodRadioButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.PaymentMethod_NextButton)));
		driver.findElement(By.xpath(ConstantObj.PaymentMethod_NextButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.cssSelector(ConstantObj.Addons_Options));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.Next_Button)));
		driver.findElement(By.xpath(ConstantObj.Next_Button)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath(ConstantObj.EmailAddress_Field)).sendKeys(ConstantObj.UserEmail);
		driver.findElement(By.xpath(ConstantObj.Passowrd_Field)).sendKeys(ConstantObj.UserPasswrd);

		js.executeScript("window.scrollBy(0,200)", "");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.GoToPaymentMethod_Button)));
		driver.findElement(By.xpath(ConstantObj.GoToPaymentMethod_Button)).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PageLogo)));
		driver.findElement(By.cssSelector(ConstantObj.PageLogo));
		driver.findElement(By.cssSelector(ConstantObj.CompleteSubscription_Title));
		driver.findElement(By.xpath(ConstantObj.CardNameHolder_Field));
		driver.findElement(By.xpath(ConstantObj.CardNumber_Field));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Month));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Year));
		driver.findElement(By.xpath(ConstantObj.CardCVV));

		driver.findElement(By.cssSelector(ConstantObj.CancelButton));
		driver.findElement(By.cssSelector(ConstantObj.SubmitButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ConstantObj.CancelButton)));
		driver.findElement(By.cssSelector(ConstantObj.CancelButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantObj.PromoPage)));
		driver.findElement(By.xpath(ConstantObj.PromoPage));
		driver.findElement(By.xpath(ConstantObj.AddEmailField));
		driver.findElement(By.xpath(ConstantObj.RedeemTheOfferButton));
		driver.findElement(By.xpath(ConstantObj.DisplayedCountryName));

		// AssertJUnit.assertEquals(driver.findElement(By.xpath(ConstantObj.DisplayedCountryName)).getText(),Country);
	}

	@Test(dataProvider = "getCountry", dataProviderClass = Constant_Countries.class)
	public void Validate_Classic_Subscription_Flow_is_Working_Successfully(String URL, String Country) {

		driver.get(URL);
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,400)", "");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#classic-selection")));

		driver.findElement(By.cssSelector("#classic-selection")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PaymentHeader)));

		driver.findElement(By.cssSelector(ConstantObj.PaymentOption));
		driver.findElement(By.cssSelector(ConstantObj.OrderSummaryTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardOption));
		driver.findElement(By.cssSelector(ConstantObj.PaymentMethodRadioButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.PaymentMethod_NextButton)));
		driver.findElement(By.xpath(ConstantObj.PaymentMethod_NextButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.cssSelector(ConstantObj.Addons_Options));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.Next_Button)));
		driver.findElement(By.xpath(ConstantObj.Next_Button)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath(ConstantObj.EmailAddress_Field)).sendKeys(ConstantObj.UserEmail);
		driver.findElement(By.xpath(ConstantObj.Passowrd_Field)).sendKeys(ConstantObj.UserPasswrd);

		js.executeScript("window.scrollBy(0,200)", "");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.GoToPaymentMethod_Button)));
		driver.findElement(By.xpath(ConstantObj.GoToPaymentMethod_Button)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PageLogo)));
		driver.findElement(By.cssSelector(ConstantObj.PageLogo));
		driver.findElement(By.cssSelector(ConstantObj.CompleteSubscription_Title));
		driver.findElement(By.xpath(ConstantObj.CardNameHolder_Field));
		driver.findElement(By.xpath(ConstantObj.CardNumber_Field));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Month));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Year));
		driver.findElement(By.xpath(ConstantObj.CardCVV));

		driver.findElement(By.cssSelector(ConstantObj.CancelButton));
		driver.findElement(By.cssSelector(ConstantObj.SubmitButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ConstantObj.CancelButton)));
		driver.findElement(By.cssSelector(ConstantObj.CancelButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantObj.PromoPage)));
		driver.findElement(By.xpath(ConstantObj.PromoPage));
		driver.findElement(By.xpath(ConstantObj.AddEmailField));
		driver.findElement(By.xpath(ConstantObj.RedeemTheOfferButton));
		driver.findElement(By.xpath(ConstantObj.DisplayedCountryName));

	}

	@Test(dataProvider = "getCountry", dataProviderClass = Constant_Countries.class)
	public void Validate_Premium_Subscription_Flow_is_Working_Successfully(String URL, String Country) {

		driver.get(URL);
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,400)", "");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#premium-selection")));

		driver.findElement(By.cssSelector("#premium-selection")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PaymentHeader)));

		driver.findElement(By.cssSelector(ConstantObj.PaymentOption));
		driver.findElement(By.cssSelector(ConstantObj.OrderSummaryTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardTitle));
		driver.findElement(By.xpath(ConstantObj.GiftCardOption));
		driver.findElement(By.cssSelector(ConstantObj.PaymentMethodRadioButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.PaymentMethod_NextButton)));
		driver.findElement(By.xpath(ConstantObj.PaymentMethod_NextButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.cssSelector(ConstantObj.Addons_Options));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.Next_Button)));
		driver.findElement(By.xpath(ConstantObj.Next_Button)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath(ConstantObj.EmailAddress_Field)).sendKeys(ConstantObj.UserEmail);
		driver.findElement(By.xpath(ConstantObj.Passowrd_Field)).sendKeys(ConstantObj.UserPasswrd);

		js.executeScript("window.scrollBy(0,200)", "");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantObj.GoToPaymentMethod_Button)));
		driver.findElement(By.xpath(ConstantObj.GoToPaymentMethod_Button)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ConstantObj.PageLogo)));
		driver.findElement(By.cssSelector(ConstantObj.PageLogo));
		driver.findElement(By.cssSelector(ConstantObj.CompleteSubscription_Title));
		driver.findElement(By.xpath(ConstantObj.CardNameHolder_Field));
		driver.findElement(By.xpath(ConstantObj.CardNumber_Field));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Month));
		driver.findElement(By.xpath(ConstantObj.CardExpiry_Year));
		driver.findElement(By.xpath(ConstantObj.CardCVV));

		driver.findElement(By.cssSelector(ConstantObj.CancelButton));
		driver.findElement(By.cssSelector(ConstantObj.SubmitButton));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ConstantObj.CancelButton)));
		driver.findElement(By.cssSelector(ConstantObj.CancelButton)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ConstantObj.PromoPage)));
		driver.findElement(By.xpath(ConstantObj.PromoPage));
		driver.findElement(By.xpath(ConstantObj.AddEmailField));
		driver.findElement(By.xpath(ConstantObj.RedeemTheOfferButton));
		driver.findElement(By.xpath(ConstantObj.DisplayedCountryName));

	}

	@AfterClass
	public void EndTest() {
		driver.quit();
	}
}
