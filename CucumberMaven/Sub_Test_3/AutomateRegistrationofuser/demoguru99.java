package AutomateRegistrationofuser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoguru99 
{
	
	protected void test1() throws IOException, InterruptedException		
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement k=driver.findElement(By.name("firstName"));
		k.sendKeys("Kishore");
		String firstName=k.getAttribute("value");
		System.out.println("First Name :"  +firstName);
		
		
		WebElement l=driver.findElement(By.name("lastName"));
		l.sendKeys("Dhanasekaran");
		String lastName=l.getAttribute("value");
		System.out.println("Last Name :"  +lastName);
		
		
		WebElement mob=driver.findElement(By.name("phone"));
		mob.sendKeys("822015478899");
		String mobNum=mob.getAttribute("value");
		System.out.println("Mobile Number :"  +mobNum);
		
		WebElement user=driver.findElement(By.name("userName"));
		user.sendKeys("kk@gmail.com");
		String userName=user.getAttribute("value");
		System.out.println("Email ID  :"  +userName);
		
		
		WebElement add=driver.findElement(By.name("address1"));
		add.sendKeys("Madurai");
		String add1=add.getAttribute("value");
		System.out.println("Address  :"  +add1);
		
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Madurai");
		String city1=city.getAttribute("value");
		System.out.println("City  :"  +city1);
	
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Tamilnadu");
		String state1=state.getAttribute("value");
		System.out.println("Tamilnadu  :"  +state1);
		
		WebElement postalCode=driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("625009");
		String postalCode1=postalCode.getAttribute("value");
		System.out.println("Postal Code  :"  +postalCode1);
		
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("AUSTRALIA");
		WebElement drpdwm=driver.findElement(By.xpath("//option[contains(text(),'AUSTRALIA')]"));
		String value = drpdwm.getText();
		System.out.println("Country :"+value);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("kishore");
		String email1=email.getAttribute("value");
		System.out.println("Username  :"  +email1);
		
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("maveric");
		String pass1=pass.getAttribute("value");
		System.out.println("Password  :"  +pass1);
		
		WebElement cpass=driver.findElement(By.name("confirmPassword"));
		cpass.sendKeys("maveric");
		String cpass1=cpass.getAttribute("value");
		System.out.println("Confirm Password  :"  +cpass1);
		
		driver.findElement(By.name("submit")).click();
		
		driver.getPageSource().contains("Your user name is cxz.");
		
		//Assertion
		
		String actualString = driver.getTitle();

		String expectedString = "Register: Mercury Tours";
		Assert.assertEquals(expectedString, actualString);
		
		System.out.println("Assertion Passed");
		
		Thread.sleep(2000);
		
		WebElement kk=driver.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(1) p:nth-child(3) font:nth-child(1) > b:nth-child(1)"));
		System.out.println(kk.getText());

	
		
		//Screenshot
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(source, new File("C:/Users/win/Desktop/Others/screen/screen.png"));
		
	        driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
