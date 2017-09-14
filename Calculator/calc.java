package calculator;
import java.util.Scanner;
import java.lang.Math;

public class calc implements calculator {
	public void multiply(int x, int y){
		System.out.println("\nMultiplication product is : " +(x*y));
	}
	public void divide(int x,int y){
		System.out.println("\nQuotient after divide is : " +(x/y));
	}
	public void sum(int x,int y){
		System.out.println("\nSum  is : " +(x+y));	
	}
	public void sub(int x,int y){
		System.out.println("\nResult after subtraction is : " +(x-y));	
	}
	public void max(int x,int y){
		if(x>y)
			System.out.println("\nMaximum is : " +x);
		else
			System.out.println("\nMaximum is : " +y);
	}
	public void min(int x,int y){
		if(x>y)
			System.out.println("\nMinimum is : " +y);
		else
			System.out.println("\nMinimum is : " +x);
	}
	public void sinCos(int x,int y){
		System.out.println("\nSine is : " +Math.sin(x));
		System.out.println("\nCos is : " +Math.cos(y));
	}
	public static void main(String[] args) {
	    int x,y,ch;
	    boolean loop=true;
	    Scanner i=new Scanner(System.in);
	    sample temp=new sample();
	    while(loop==true){
    		System.out.println("\n1.Multiply\n2.Divide\n3.Sum\n4.Subtraction\n5.Maximum\n6.Minimum\n"); 
    		ch=i.nextInt();
    		switch(ch){
    		
    		case 1:System.out.println("\nEnter the elements:");
    		       x=i.nextInt();
    		       y=i.nextInt();
    		       temp.multiply(x,y);
    		       break;
    		case 2:System.out.println("\nEnter the elements");
		           x=i.nextInt();
		           y=i.nextInt();
		           temp.divide(x,y);
    		       break;
    		case 3:System.out.println("\nEnter the elements");
		           x=i.nextInt();
		           y=i.nextInt();
		           temp.sum(x,y);
    		       break;
    		case 4:System.out.println("\nEnter the elements");
		           x=i.nextInt();
		           y=i.nextInt();
		           temp.sub(x,y);
		           break;
    		case 5:System.out.println("\nEnter the elements");
		           x=i.nextInt();
		           y=i.nextInt();
		           temp.max(x,y);
		           break;
    		case 6:System.out.println("\nEnter the elements");
		           x=i.nextInt();
		           y=i.nextInt();
		           temp.min(x,y);
		           break;
    		case 7:System.out.println("\nEnter the elements");
	                   x=i.nextInt();
	                   y=i.nextInt();
	                   temp.sinCos(x,y);
	                   break;
    		case 8:loop=false;
    		       System.out.println("\nProgram terminated\n");
    	       	       break;
    		}
    	}

	}

}
