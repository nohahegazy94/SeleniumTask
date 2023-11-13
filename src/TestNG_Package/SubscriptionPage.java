package TestNG_Package;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;


@Listeners(TestNG_Package.Listeners.class)  
public class SubscriptionPage {
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Constants ConstantObj = new Constants();
	
	@BeforeClass
	public void intializtion()
	{
		driver.get(ConstantObj.Website_URL);
		
		if (driver.getCurrentUrl().contains("ar"))
		{
			String English_URL;
			English_URL = driver.getCurrentUrl().replace("ar", "en");
			driver.get(English_URL);
		}
	}
	
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThatSubscriptionsPageOpensSuccessfully_And_HaveCorrectCountryName(String URL, String Country)
	{
		driver.get(URL);
		
		String ActualCountry = driver.findElement(By.id("country-name")).getText();
		AssertJUnit.assertEquals(ActualCountry, Country);
		driver.findElement(By.cssSelector(ConstantObj.Country_Name));
	}		
	
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThat_Lite_PackageDisplayedSuccessfully (String URL, String Country)
	{
		
		js.executeScript("window.scrollBy(0,450)", "");
		
		driver.findElement(By.xpath(ConstantObj.Lite_Package_Name));
		
		driver.findElement(By.xpath(ConstantObj.Lite_Start_Button));
		driver.findElement(By.xpath(ConstantObj.Lite_Monthly_Price));
	
		driver.findElement(By.xpath(ConstantObj.Lite_Price));
		driver.findElement(By.xpath(ConstantObj.Lite_Currency));
		
		js.executeScript("window.scrollBy(0,100)", "");
		

		driver.findElement(By.cssSelector(ConstantObj.Lite_Discovery));
		driver.findElement(By.cssSelector(ConstantObj.Lite_FreeTrail));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
	//	driver.findElement(By.xpath(ConstantObj.Lite_VideoQuality));
	//	driver.findElement(By.xpath(ConstantObj.Lite_DeviceAccess));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
	//	driver.findElement(By.xpath(ConstantObj.Lite_Rewind));
		driver.findElement(By.cssSelector(ConstantObj.Lite_Offline));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
		driver.findElement(By.cssSelector(ConstantObj.Lite_Simultaneously));
		driver.findElement(By.cssSelector(ConstantObj.Lite_CastTV));
		
		
	}
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThat_Classic_PackageDisplayedSuccessfully (String URL, String Country)
	{
		
		driver.findElement(By.xpath(ConstantObj.Classic_Package_Name));
		
		driver.findElement(By.xpath(ConstantObj.Classic_Start_Button));
		driver.findElement(By.xpath(ConstantObj.Classic_Monthly_Price));
	
		driver.findElement(By.xpath(ConstantObj.Classic_Price));
		driver.findElement(By.xpath(ConstantObj.Classic_Currency));
		
		js.executeScript("window.scrollBy(0,100)", "");
		

		driver.findElement(By.cssSelector(ConstantObj.Classic_Discovery));
		driver.findElement(By.cssSelector(ConstantObj.Classic_FreeTrail));
		
		js.executeScript("window.scrollBy(0,150)", "");
		
		driver.findElement(By.xpath(ConstantObj.Classic_VideoQuality));
		driver.findElement(By.cssSelector(ConstantObj.Classic_DeviceAccess));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
	//    driver.findElement(By.xpath(ConstantObj.Classic_Rewind));
		driver.findElement(By.cssSelector(ConstantObj.Classic_Offline));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
	//	driver.findElement(By.cssSelector(ConstantObj.Classic_Simultaneously));
		driver.findElement(By.cssSelector(ConstantObj.Classic_CastTV));
	}
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThat_Premium_PackageDisplayedSuccessfully(String URL, String Country)
	{
		
		driver.findElement(By.xpath(ConstantObj.Premium_Package_Name));
		
		driver.findElement(By.xpath(ConstantObj.Premium_Start_Button));
		driver.findElement(By.xpath(ConstantObj.Premium_Monthly_Price));
	
		driver.findElement(By.xpath(ConstantObj.Premium_Price));
		driver.findElement(By.xpath(ConstantObj.Premium_Currency));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
//		driver.findElement(By.cssSelector(ConstantObj.Premium_Discovery));
		driver.findElement(By.cssSelector(ConstantObj.Premium_FreeTrail));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
//		driver.findElement(By.xpath(ConstantObj.Premium_VideoQuality));
//		driver.findElement(By.xpath(ConstantObj.Premium_DeviceAccess));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
//		driver.findElement(By.xpath(ConstantObj.Premium_Rewind));
		driver.findElement(By.cssSelector(ConstantObj.Premium_Offline));
		
		js.executeScript("window.scrollBy(0,100)", "");
		
//		driver.findElement(By.cssSelector(ConstantObj.Premium_Simultaneously));
		driver.findElement(By.cssSelector(ConstantObj.Premium_CastTV));
	}
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThat_AddOns_SectionDisplayedSuccessfully(String URL, String Country)
	{
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.cssSelector(ConstantObj.Addons_Section));
	//	driver.findElement(By.xpath(ConstantObj.Addons_Title));
	//	driver.findElement(By.xpath(ConstantObj.Addon_SubTitle));
	}
	@Test(dataProvider="getCountry",dataProviderClass = Constant_Countries.class)
	public void ValidateThat_GiftCard_SectionDisplayedSuccessfully(String URL, String Country)
	{
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.cssSelector(ConstantObj.GiftCard_Section));
//		driver.findElement(By.xpath(ConstantObj.GiftCard_Title));
	}
	
	@AfterClass
	public void EndTest()
	{
		driver.quit();
	}
}
