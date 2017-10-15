import java.util.*;
public class circularShift {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str =new String();
		System.out.println("enter a string:");
		str=s.nextLine();
		String str1=new String();
	    int x=0;
	    while(x!=str.length())
		{
			str1+=str.substring(1, str.length());
			str1+=str.substring(0,1);
			str=str1;
			str1="";
			System.out.println(str);
			x++;
		}
	}
}
