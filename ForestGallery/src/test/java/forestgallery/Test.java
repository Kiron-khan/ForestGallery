package forestgallery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.forestgallery.com/");
		
		// WebElement search= driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/header/nav/div/div/div/div/div[3]/ul/li[1]/form/input"));
		  //search.sendKeys("Ben Payne");
		  WebElement search_button= driver.findElement(By.xpath("//*[@id=\"st-trigger-effects\"]/header/nav/div/div/div/div/div[3]/ul/li[1]/form/span/input"));
		  search_button.click();

	}

}
