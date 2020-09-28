package Brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks
{
	     public static void verifyLink(String urlLink) 
		    {
	    	 
	    	 try {
		 
		            URL l1 = new URL(urlLink);
		            HttpURLConnection httpConn =(HttpURLConnection)l1.openConnection();
		            httpConn.setConnectTimeout(2000);
		            httpConn.connect();
		            System.out.println("Message" +httpConn.getResponseCode());
		            int m1 = httpConn.getResponseCode();
		            String str = Integer.toString(m1);
		            if(str.contains("5")) 
		            { 
		                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		            }
		            if(str.startsWith("4")) 
		            {
		                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		            }
		            if(str.contains("3")) 
		            {
		                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		            }
		            if(str.startsWith("2")) 
		            {
		                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		            }
		            if(str.startsWith("1")) 
		            {
		                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		            }
		        }
		        catch (Exception e) 
		        {
		            e.printStackTrace();
		        }


		    } 
		    public static void main(String[] args)  
		    {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win\\eclipse-workspace\\sample\\driver\\chromedriver.exe");
		         WebDriver driver = new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        
		         //driver.get("https://www.amazon.com/");
		         
		       driver.get("https://maveric-systems.com/");
		         
		         List<WebElement> availableLink = driver.findElements(By.tagName("a")); 
		         System.out.println("Total links are "+availableLink.size()); 
		         for(int i=0; i<availableLink.size(); i++) 
		         {
		         WebElement z = availableLink.get(i);
		         String xy=z.getAttribute("href");
		         verifyLink(xy); 
		         }
		         driver.quit();
		    }
		    }



