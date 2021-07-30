package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grid {

	@Test
	void googleTest() throws MalformedURLException, InterruptedException {

		String hubURL="http://10.0.0.158:4444/wd/hub";
		String pageURL= "https://www.afrocouple.com/";
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), cap);

		driver.get(pageURL);
		System.out.println(driver.getCurrentUrl()+ "*** is the current URL visited ***");
		System.out.println(driver.getTitle()+"*** is the page we have visited ***");
		Thread.sleep(5000);
		driver.close();
		System.out.println("Jenkins Created");
	}

}
