package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleelementException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		/*WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Java");
		driver.navigate().refresh();
		textbox.sendKeys("Selenium");*/
		
		GoogleSearchPage search=new GoogleSearchPage(driver);
		search.getTexBox().sendKeys("Java");
		driver.navigate().refresh();
		search.getTexBox().sendKeys("Selenium");
		}

}
