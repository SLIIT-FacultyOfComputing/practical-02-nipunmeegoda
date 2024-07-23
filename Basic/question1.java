package Basic;
import java.util.*;
public class question1{
	public static void main(String[] arg){
	String FirstName;
	String MiddleName;
	String LastName;
	String FullName_1;
	String FullName_2;

System.out.print("Main Menu\n1.Part 1\n2.Part 2\n);
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
	String FullName_1 = sb.toString();

	System.out.println("Your Full Name " + FullName_1);
		}
}
