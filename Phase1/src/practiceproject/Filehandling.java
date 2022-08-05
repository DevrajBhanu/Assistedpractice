package practiceproject;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Filehandling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        DataInputStream dis=new DataInputStream(System.in); 
        FileOutputStream fout=new FileOutputStream("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt",true); 
  
        
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.print("Enter text (@ at the end):"); 
        char ch; 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        }
        bout.close(); 
        System.out.println("Text is written to the File & Run Program again to append file");
        //for reading the file contents
        FileInputStream fin= new FileInputStream("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt");
        System.out.println("FileContents :"); 
        int ch1; 
        while((ch1=fin.read())!=-1) 
        {
            System.out.print((char)ch1); 
        }  
        //close the file 
        fin.close(); 
        
        
    
    } 


	}


