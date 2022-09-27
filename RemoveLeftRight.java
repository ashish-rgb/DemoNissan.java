import java.util.*;
public class RemoveLeftRight {
	
	public static void main (String[] args)
	    {
	      String str =  "hello#world";
	      
	      System.out.println("The given strings is: "+str);
	      int len = str.length();
		  String resultString = "";
		  
		  for (int i = 0; i < len; i++) 
		  {
		    if (i == 0 && str.charAt(i) != '#')
		      resultString += str.charAt(i);
		    if (i > 0 && str.charAt(i) != '#' && str.charAt(i-1) != '#')
		      resultString += str.charAt(i);
		    if (i > 0 && str.charAt(i) == '#' && str.charAt(i-1) != '#')
		      resultString = resultString.substring(0,resultString.length()-1);
		    //if (i > 0 && stng.charAt(i) != '#' && stng.charAt(i-1) == '#')
			     // resultString = resultString + resultString.substring(stng.charAt(i+1),stng.length()-1);
		  }
	      
	      System.out.println("The new string is: "+ resultString);
		  }
}
