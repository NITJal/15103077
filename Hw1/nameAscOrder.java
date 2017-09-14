import java.util.Scanner;
public class nameAscOrder {

	public static void main(String[] args) {
		int n;
	        String t;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of names:");
	        n=s.nextInt();
	        String name[]=new String[n];
	        Scanner s1=new Scanner(System.in);
	        System.out.println("Enter names:");
	        for(int i = 0; i < n; i++)
	        {
	            names[i] = s1.nextLine();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (names[i].compareTo(names[j])>0) 
	                {
	                    t = name[i];
	                    name[i] = name[j];
	                    name[j] = t;
	                }
	            }
	        }
	        System.out.print("Names in ascending order:");
	        for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.print(name[i] + ",");//to not print , after last name
	        }
	        System.out.print(name[n - 1]);
	}

}
