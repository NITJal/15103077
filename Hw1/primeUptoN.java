import java.util.Scanner;
public class primeUptoN {

	public static void main(String[] args) {
		int z,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer:");
		z=s.nextInt();
		for(int i=2;i<n;i++){
			t=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				t=1;
			}
			if(t==0)
				System.out.println(i);
		}
	}
}
