package DIY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData
{
	public static void main(String[] args) throws IOException {
		
		File file =new File ("C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\files\\textfile.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		String str=br.readLine();
		System.out.println(str);
		
	
		
	}

}

