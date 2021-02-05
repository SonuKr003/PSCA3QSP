package demo.DataProvider.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DataProviderP {

	@Test(dataProvider = "demo", dataProviderClass = DemoReadData.class)
	public void TC_01(String user, String pass) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass,Keys.ENTER);
		
		WebDriverWait ww= new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.titleContains("Enter"));
	}
}
