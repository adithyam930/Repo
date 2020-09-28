package waitMethods_javaexception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaexception {

		    static WebDriver driver;
		    @SuppressWarnings("unused")
			public static void main(String[] args) throws Exception
		    {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\win\\eclipse-workspace\\sample\\driver\\chromedriver.exe");
		         driver = new ChromeDriver();
		         driver.manage().window().maximize();
		         //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		         driver.get("https://moodle.maveric-systems.com/login/index.php");
		         WebElement s2=driver.findElement(By.id("username"));
		         s2.sendKeys("Admin");
		        WebElement s3= driver.findElement(By.id("password"));
		        		s3.sendKeys("admin123");
		         //No Such Element Exception

		         try 
		         {
		            driver.findElement(By.id("12345678")).click();
		        } 
		         catch (Exception e) 
		        {
		            System.out.println("No Such Element Exception");
		            
		        }
		         
		         try 
		         {
		            Alert alert = driver.switchTo().alert();
		            alert.accept();
		        } 
		         catch (Exception e) 
		        {
		            System.out.println("No Alert Present Exception");
		            
		        }
		       
		         String filename = "input.txt";
		         
		         try
		         {
		        	 BufferedReader rd = new BufferedReader(new FileReader(new File(filename)));
		        	 
		         }
		         catch(Exception e)
		         {
		        	 System.out.println("File Not Found Exception");
		         }
		         try {
			            
		        	 driver.switchTo().frame("a077aa5e");
			        } 
		         catch (Exception e) {
			            
			            System.out.println("No Such Frame Exception");
			        }
		    }


}
