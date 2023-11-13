import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://subscribe.jawwy.tv/");
	//	System.out.println(driver.getTitle());
		
	//	System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("ar"))
		{
			String English_URL;
			English_URL = driver.getCurrentUrl().replace("ar", "en");
			driver.get(English_URL);
		}
			
		driver.close();
		driver.quit();
	}

}
