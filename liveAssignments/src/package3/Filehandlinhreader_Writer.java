package package3;
import java.io.File;
import java.io.FileWriter;


public class Filehandlinhreader_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="We are learning java";
		try{
			FileWriter output=new FileWriter("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt");
			output.write(data);
			System.out.println("Data is written to the file");
			output.close();
			
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
