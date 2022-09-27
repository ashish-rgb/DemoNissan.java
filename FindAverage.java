import java.util.*;
public class FindAverage {

	public static void main(String[] args) {
		
		int[] marks = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0;i<marks.length;i++){
			marks[i] = sc.nextInt();
			 sum += marks[i];
		}
		  
		double avg = sum/(marks.length);
		
		System.out.println("Average marks of students is " + avg);
		
	}

}
