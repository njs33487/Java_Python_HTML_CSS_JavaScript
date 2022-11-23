package examples;

import java.io.FileINputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample	{
	public static void openFile() throws FileNotFoundException {
		new FileImageInputStream("C;\\DoesNotExist.txt");
	}
	public static void main(String[] args)	{
		openFile();
		
		try { openFile();}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			
		}
	}
}