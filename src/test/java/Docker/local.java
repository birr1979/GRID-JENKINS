package Docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class local {
	@Test
	void googleTest() throws InterruptedException {

		String pageURL= "https://www.google.com/";
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(pageURL);
		System.out.println(driver.getCurrentUrl()+ "*** is the current URL visited ***");
		System.out.println(driver.getTitle()+"*** is the page we have visited ***");
		Thread.sleep(5000);
		driver.close();
	}

}
