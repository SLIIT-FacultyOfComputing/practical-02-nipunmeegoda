package Basic;
import java.util.*;
public class question1{
	public static void main(String[] arg){
	String FirstName;
	String MiddleName;
	String LastName;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Name: ");
	FirstName = sc.nextLine();
	
	System.out.print("Enter Middle Name:");
        MiddleName = sc.nextLine();
	
	System.out.print("Enter Last Name: ");
        LastName = sc.nextLine();

	StringBuilder sb = new StringBuilder();
	sb.append(LastName);
	sb.append(" ");
	sb.append(FirstName);
	sb.append(" ");
	sb.append(MiddleName);
	String fullName = sb.toString();

	System.out.println("Your Full Name " + fullName);
		}
}
