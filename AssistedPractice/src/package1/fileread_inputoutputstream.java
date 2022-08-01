package package1;

import java.io.FileInputStream;
import java.io.IOException;

public class fileread_inputoutputstream {

	public static void main(String[] args)  throws IOException {
		
	      FileInputStream fin= new FileInputStream("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt"); 

	      System.out.println("FileContents :");
	      int ch; 
	      while((ch=fin.read())!=-1) 
	          System.out.print((char)ch); 
	        
	      fin.close(); 

	}

}
