import java.util.Scanner;


public class DemoLargestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Get input from the user
		System.out.print("Enter the first string: ");
		String firstString = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String secondString = input.nextLine();
		
		//Logic
		
		//find length of smaller string
		int smaller = Math.min(firstString.length(),secondString.length());
		
		//Length of smaller string as max loop interaction
		//character to be checked from first to second
		//String Builder is used to append
		
		StringBuilder commonString = new StringBuilder();
		for(int i=0;i<smaller;i++){
			char c = firstString.charAt(i);
			
			//check condition
			if(c==secondString.charAt(i)){
				commonString.append(c);
			}else{
				break;
			}
		}
		
		//print the output
		if(commonString.length()==0){
			System.out.println(firstString + " and " + secondString + " have no common prefix");
		}
		else{
			System.out.println("The common prefix is " + commonString);
		}
		
	}

}
