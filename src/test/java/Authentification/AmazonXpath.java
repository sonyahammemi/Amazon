package Authentification;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	@Test
	public void authentificationCorrect() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\ChromeDriver120/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.fr/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//Absolute XPath
		
		WebElement click =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]"));
        click.click();
        WebElement userLogin = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        userLogin.sendKeys("sonya.hammemii@gmail.com"+Keys.ENTER);
        WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
        password.sendKeys("test123"+Keys.ENTER);
       
        String actualText =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]")).getText();
        String expectedText = "Bonjour sonia";
        Assert.assertEquals(expectedText, actualText);
        
        driver.quit();
	}

}


// absolute xpath : /html/body/div/ul[1]/li[1}... :arborescence 
//relative xpath : tagName[@ attribute = 'value'] -> //ul[@classe='']
//generate xpath : *[@attribute = 'value']




