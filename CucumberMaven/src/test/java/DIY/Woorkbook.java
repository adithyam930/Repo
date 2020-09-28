package DIY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Woorkbook 
{
	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\win\\Desktop\\TestData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook ("C:\\Users\\win\\Desktop\\TestData.xlsx");
		XSSFSheet s=wb.getSheet("TestData");
		//Iterator<Row> rowIt=s.iterator();
		
		
		
		
	}
}
