package package3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class regular_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println (Pattern.matches("^\\d{10}$", "+91 7512589874")); 
		
		//for passowrd    Pattern.compile("[A-Z]{1}@[0-9]{4}[a-zA-Z]{4}");
		
		
		        // Following line prints "true" because the whole text "geeksforgeeks" matches pattern "geeksforge*ks" 
		        System.out.println (Pattern.matches("geeksforge*ks", "geeksforgeeks")); 
		  
		        // Following line prints "false" because the whole text "geeksfor" doesn't match pattern "g*geeks*" 
		        System.out.println (Pattern.matches("g*geeks*", "geeksfor")); 
		        
		        
		        //------------------------------------PATTERN SEARCHING------------------------------------//
		        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s) 
		        
		        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n) 
		        
		        
		        //------------------------------------QUANTIFIER------------------------------------------//
		        System.out.println("? quantifier ....");  
		        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		          
		        System.out.println("+ quantifier ....");  
		        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		          
		        System.out.println("* quantifier ....");  
		        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
		         
		               
		        //------------------------------------META-CHARACTER------------------------------------------// 
		        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		          
		        System.out.println("metacharacters D....");  //D means non-digit  
		          
		        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		        System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		          
		        System.out.println("metacharacters D with quantifier....");  
		        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
		        
		        //System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "S564teutidkghdjdkg"));
		        
		   } 
		} 


	