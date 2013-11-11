package fileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;
//import java.io.IOException;

public class FileReading 
{
	FileReader readFile;
	BufferedReader reader;	
	public File file;
	private String fileLocation;	
	Scanner scan;
	
	public FileReading()
	{
		scan = new Scanner(System.in);
	}
	
	
	
	public File chooseFile()
	{
		System.out.println("Input File Path");
		fileLocation = scan.next();		
		file = new File(fileLocation);	
		return file;
	}

	public void boardStartUp()
    {
		boolean FileErrors = false;
		do
		{
			FileErrors = false;
			try(BufferedReader br = new BufferedReader(new FileReader(chooseFile())))
        	{
            	while(br.ready())
            	{
            		br.readLine();
            		//System.out.println(br.readLine());
            	}
        	}
        	catch (Exception e)
        	{
        		//e.printStackTrace();
            	System.out.println("Can't find file: " + file.toString());
            	FileErrors = true;
        	}
			
		}
		while(FileErrors);

        
    }
}
