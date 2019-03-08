package forestgallery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		 String projectPath= System.getProperty("user.dir");
		 System.out.println("projectPath : "  +projectPath);
		 
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver", projectPath+"/driver/Gecodriver/geckodriver.exe");
		 
		 //WebDriver driver = new ChromeDriver();
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.forestgallery.com/");
		 

	}

}
