import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class DemoDateString {

	public static void main(String[] args) throws ParseException {
		
		//declare Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Employee name, DeptId ,Salary,JoinDate
		
		System.out.println("Enter the name :");
		String empName = scanner.nextLine();

		System.out.println("Enter Dept Id :");
		int empId = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter salary :");
		double empSalary = Double.parseDouble(scanner.nextLine());
		
	   System.out.println("Enter Join Date : ");	
		
		Date dateJoinDate = null; //hungarian Notation
		String joinDate = scanner.nextLine();
		
		dateJoinDate = dateConversion(joinDate);
		
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(empSalary);
		
		//Convert Util Date to String
		String joinDateToString = new SimpleDateFormat("dd/MM/yyyy").format(dateJoinDate);
		System.out.println(joinDateToString);
	}
	
	private static Date dateConversion(String joinDate) throws ParseException{
		
		//string to date
		Date utilDate = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
		
		//Convert to SQL date
		Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		return sqlDate;
	}

}
