import java.util.*;

class exception extends Exception{
	
	exception()
	{
		super();
	}
}

public class ATM {

	static int atm_min = 1000;
	static int atm_max = 25000;
	int pin;
	int bank_bal;
	int exec;
	ATM(int a, int b)
	{
		bank_bal = a;
		pin = b;
	}
	void withdraw(int amt)
	{
		if(amt>bank_bal || amt<1000 || amt>25000){
			this.exec = 0;
			throw new ArithmeticException("Wrong amount\n");
			
			}
		bank_bal = bank_bal-amt;
	}
	
	void deposit(int amt)
	{
		bank_bal=bank_bal+amt;
	}
	void display()
	{
		System.out.println(bank_bal);
	}
	void pin_check(int pinc) throws exception
	{
		exception m = new exception();
		if(pin<1000 || pin>9999 || pinc!= this.pin)
				throw new  exception();
	}
	public static void main(String[] args) {
			System.out.print("Enter bank balance and pin: ");
			Scanner sc = new Scanner(System.in);
			int bal = sc.nextInt();
			int pinc = sc.nextInt();
			int opt;
			ATM a = new ATM(bal, pinc);
			while(true){
			System.out.println("Options: \n1.Withdraw\n2.Deposit\n3.Display\n4.Exit");
			opt = sc.nextInt();
			switch(opt)
			{
			case 1:
				System.out.print("Enter the amount:\n");
				int amt = sc.nextInt();
				
				try{
				a.withdraw(amt);
				System.out.println("Enter pin: ");
				pinc = sc.nextInt();
				a.pin_check(pinc);
				System.out.println("Transaction Completed\n");
				break;
				}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
					System.out.println("Transaction Cancelled\n");
				}
				catch(exception p)
				{
					System.out.println("Incorrect pin\n");
					System.out.println("Transaction Cancelled\n");
					
				}
				break;
			case 2:System.out.println("Enter the amount :\n");
			       int a1=sc.nextInt();
			       
			       try{
						a.deposit(a1);
						System.out.println("Enter pin:");
						pinc = sc.nextInt();
						a.pin_check(pinc);
						System.out.println("Transaction Completed\n");
						break;
						}
						catch(ArithmeticException e)
						{
							System.out.println(e.getMessage());
							System.out.println("Transaction Cancelled\n");
						}
						catch(exception p)
						{
							System.out.println("Incorrect pin\n");
							System.out.println("Transaction Cancelled\n");
							
						}
						break;
			case 3:a.display();
				   break;
			case 4:
				break;
			}
			if(opt>5)
				break;
			}
			
	}

}