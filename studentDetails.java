package studentDetails;
import java.util.*;
class FormException extends Exception{
	FormException()
	{
		super();
	}
}

class StudentDetails {

	String name;
	String address;
	String email;
	int HSCPercentage;
	int UGPercentage;
	long phone;
	void FillDetails(String name, String address ,String email, int HSCPercentage, int UGPercentage, long phone)
	{
		this.name  = name;
		this.email = email;
		this.address=address;
		this.HSCPercentage = HSCPercentage;
		this.UGPercentage = UGPercentage;
		this.phone = phone;
	}
	void Check() throws FormException
	{
		if(HSCPercentage<60 || UGPercentage<70)
			    throw new FormException();
			    
		if(phone<1000000000 || phone>980000000)
		{
		    System.out.println("Invalid phone number !! ");
		    throw new NumberFormatException();   
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,Add,email;
		int A,B;
		long ph;
		System.out.println("Enter Student Name:  ");
		    name= sc.nextLine();
		System.out.println("Enter Student Address:  ");
		    Add= sc.nextLine();
		System.out.println("Enter Student email:  ");
		    email = sc.nextLine();
		System.out.println("Enter High School percentage:  ");
		    A = sc.nextInt();
		System.out.println("Enter UG percentage:  ");
		    B = sc.nextInt();
		System.out.println("Enter Phone number:  ");
		ph = sc.nextLong();
		StudentDetails stu = new StudentDetails();
		stu.FillDetails(name,Add,email,A,B,ph);
		try
		{
			stu.Check();
			System.out.println("Admission done!!\n");
		}
		catch(FormException e)
		{
			System.out.println("Not Eligible!!\n\n");
		}
		catch(NumberFormatException d)
		{
			System.out.println("Enter Details Correctly!!\n");
		}
	}

}