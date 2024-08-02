package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rough {

	@Test
	public void rough() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//driver.findElement(By.linkText("Calendar")).click();
		//driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
//		driver.findElement(By.cssSelector("input[name='accountname']")).sendKeys("Abc");
//		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Go to Advanced Search")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
