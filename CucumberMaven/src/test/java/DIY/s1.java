package DIY;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Row;


public class s1 {

	static WebDriver driver;
	
	public static void main(String[] args)   
	{  
		
		
	s1 rc=new s1();  
	String vOutput=rc.ReadCellData(2,0); 
	System.out.println(vOutput);  
	}  
	//method defined for reading a cell  
	
	public static String ReadCellData(int vRow, int vColumn)  
	{  
	String value=null;      
	Workbook wb=null;          
	try  
	{   
	FileInputStream fis=new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");  
	wb=new XSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
	e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
	e1.printStackTrace();  
	}  

	
	
	Sheet sheet=wb.getSheetAt(0);  
	Row row=sheet.getRow(vRow); 
	Cell cell=row.getCell(vColumn);
	value=cell.getStringCellValue();    
	return value;
	
	
	
	
	}  
	}  