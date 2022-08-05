package package3;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputoutput_Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
        DataInputStream dis=new DataInputStream(System.in); 
  
        
        FileOutputStream fout=new FileOutputStream("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt",true); 
  
        
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        //close the file 
        bout.close(); 
    } 

	

}
