package Readvalue;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettinoutputinConsole {

		    public static void main(String[] args)
		    {
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\driver\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		   
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		   
		    driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
		   
		    List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		   
		    for (int i = 0; i < tRows.size(); i++) {
		        WebElement eachRow = tRows.get(i);
		       
		    List<WebElement> tDatas = eachRow.findElements(By.tagName("td"));
		   
		    for (int j = 0; j < tDatas.size(); j++) {
		        WebElement eachData = tDatas.get(j);
		       
		        String text = eachData.getText();
		        System.out.print(text);
		    }
		       System.out.println(" ");
		    }
		}
}
