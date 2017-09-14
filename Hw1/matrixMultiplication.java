package basic;
import java.util.Scanner;

public class matrixMultiplication {

	public static void main(String[] args) {
		int x[][]=new int[2][2];
		int y[][]=new int[2][2];
		int z[][]=new int[2][2];
		int t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values for array X: ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				t=s.nextInt();
				x[i][j]=t;
			}
		}
		System.out.println("Enter the values for array Y: ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				t=s.nextInt();
				y[i][j]=t;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					z[i][j]=z[i][j]+x[i][k]*y[k][j];
				}
			}
		}
		System.out.println("Values of Array Z:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}

}
