package cpps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.quit();
		//driver.close();
	}

}
