import java.util.*;
public class SumofDigits {
	   public static void main(String[] args) {
		   
	   String s ="45Faith89Infotech8";
	   int sum=0;
	   
	   for (int i = 0; i < s.length(); i++) {
	      if(Character.isDigit(s.charAt(i))){ 
	      sum=sum+Character.getNumericValue(s.charAt(i));
	      }
	     }
	   
	   System.out.println("Sum is : "+sum);
	  }
	
}
