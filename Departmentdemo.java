package Basic;
import java.util.*;

public class Departmentdemo {
	

	public static void main(String[] args)
	{
	
		String dept1="Operations";
		String dept2="Sales";
		String dept3="It";
		
		System.out.println("Enter department letter (O/S/I):");
		Scanner sc=new Scanner(System.in);
		
		char dept=sc.nextLine().charAt(0);
		switch(dept)
		{
		case 'O':System.out.println(dept1);
		break;
		case 'S':System.out.println(dept2);
		break;
		case 'I':System.out.println(dept3);
		break;
		default:System.out.println("Invalid department!");
		}
	}

}
