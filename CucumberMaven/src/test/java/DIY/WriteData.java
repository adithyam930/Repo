package DIY;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData 
{
	public static void main(String[] args) throws IOException 
	{
		File file =new File("C:\\Users\\win\\Desktop\\TestData.xlsx");
		
		FileWriter fw=new FileWriter(file);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("First data ");
		
		bw.newLine();
		bw.write("Second Data");
		
		bw.close();
		
		System.out.println("Data has been written");
	}
}
