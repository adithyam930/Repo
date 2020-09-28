package waitMethods_javaexception;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits {

		void implicit() {
			WebDriver driver;
			System.out.println("Implicit wait");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://moodle.maveric-systems.com/login/index.php");
			WebElement s2 = driver.findElement(By.id("username"));
			s2.sendKeys("Admin");
			driver.quit();
		}
		@SuppressWarnings({ "deprecation", "unused" })
		public static void main(String[] args) throws InterruptedException
		{
			// TODO Auto-generated method stub
			Waits x1 = new Waits();
			x1.implicit();

			WebDriver driver1;
			System.out.println("Explicit wait");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver1 = new ChromeDriver();
			driver1.get("https://moodle.maveric-systems.com/login/index.php");

			driver1.findElement(By.xpath("//button[@class='btn btn-secondary btn-block']")).click();
			WebDriverWait wait = new WebDriverWait(driver1, 20);

			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-danger']")));

			// if element found then we will use- In this example I just called isDisplayed
			// method
			boolean status = element.isDisplayed();

			// if else condition
			if (status) {
				System.out.println("===== WebDriver is visible======");
			} else {
				System.out.println("===== WebDriver is not visible======");
			}
			

		
			WebDriver driver11;
			System.out.println("Fluent wait");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver11 = new ChromeDriver();
			driver11.get("https://moodle.maveric-systems.com/login/index.php");
			driver11.findElement(By.id("username"));

			Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver11).withTimeout(30, TimeUnit.SECONDS)

					.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

			WebElement foo = wait1.until(new Function <WebDriver, WebElement>() 
			{
				public WebElement apply(WebDriver driver1) {
					WebElement element= driver1.findElement(By.xpath("//button[@class='btn btn-secondary btn-block']"));
					if(element.isEnabled()) {
						System.out.println("Element found");
						
					}
					return element;
				}
			});
			
			element.click();
			Thread.sleep(3000);
			driver11.close();
			driver11.quit();

		}}

