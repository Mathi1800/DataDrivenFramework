package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUserName {

	@Test
	@Parameters({ "username", "password" })
	public void LoginWithCorrectUserName(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(uName);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pWord);

		WebElement button = driver.findElement(By.id("submit"));
		button.click();

	}
}
