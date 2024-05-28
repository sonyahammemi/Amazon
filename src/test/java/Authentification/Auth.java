package Authentification;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Auth {

	 
		@Test
		public void authentificationCorrectAmazon() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\ChromeDriver120/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url = "https://www.amazon.fr/";
			driver.get(url);
			driver.manage().window().maximize();
			
			WebElement clickElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			clickElement.click();
			driver.findElement(By.id("ap_email")).sendKeys("sonya.hammemii@gmail.com"+Keys.ENTER);
			driver.findElement(By.id("ap_password")).sendKeys("test123"+Keys.ENTER);
			String actualText = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
			String expectedText = "Bonjour sonia";
			Assert.assertEquals(expectedText, actualText);
			
			driver.quit();
		}
	

}
