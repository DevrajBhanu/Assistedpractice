package package1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pattern p = Pattern.compile(
		            "re*", Pattern.CASE_INSENSITIVE);
		 
		        // Searching above pattern in "geeksforgeeks.org"
		        Matcher m = p.matcher("We are Learning Java Tree");
		 
		        // Find th above string using find() method
		        while (m.find())
		 
		            // Printing the starting and ending indexes of
		            // the pattern in text using class method
		            // functionalities
		            System.out.println("Pattern found  "
		                               + m.start() + " to "
		                               + (m.end() - 1)+"index");

	}

}
