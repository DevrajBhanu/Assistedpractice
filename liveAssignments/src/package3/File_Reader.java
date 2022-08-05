package package3;

import java.io.FileWriter;

public class File_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data="We are learning java";
		char ch[]=new char[60];
		
		try{
			FileReader input=new FileReader("C://Users//Devraj Bhanu//Desktop//Simplilearn//phase1.txt");
			output.read(ch);
			System.out.println("Data in the file");
			System.out.println(ch);
			
			input.close();
			
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}

	}

}
