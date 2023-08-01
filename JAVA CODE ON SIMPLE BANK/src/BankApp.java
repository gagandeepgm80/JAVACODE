import java.util.Scanner;
class Bank
{
	int balance = 500;
	void deposite(int n)
	{
		 balance = balance + n;
		
	}
	void accountbalance()
	{
		
		System.out.println( " THE TOTAL AVAILABLE BALANCE IS: " +balance);
	}
	void withdraw(int n)
	{
		
		if(n<=balance)
		{
		 balance = balance -n;
		 System.out.println("WITHDRAW SUCCESSFULL");
		}
		else {
			System.out.println("AMOUNT EXCEEDED");
		}
		
	}
}

class BankApp
{
	public static void main(String[] args)
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("WELCOME TO SBI");
		System.out.println("---------------------------------------------------------");
		int n=3;
		int i=0;
		int pin =1010;
		Scanner scan = new Scanner(System.in);
		
		while(i<3)
		{
			System.out.println("ENTER YOUR PIN");
		int s = scan.nextInt();
			if(s==pin)
			{
				System.out.println("VALID PIN");
				
			
			
		

		System.out.println("---------------------------------------------------------");
            System.out.println("WELCOME TO SBI");
			System.out.println("---------------------------------------------------------");
			Bank b = new Bank();
			while(true){
			System.out.println("SELECT YOUR CHOICE");
		    
		    System.out.println("1.DEPOSIT");
			System.out.println("2.ACCOUNT BALANCE");
			System.out.println("3.WITHDRAW");
			System.out.println("4.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            n=scan.nextInt();

		
		switch(n)
		{
			case 1:
				System.out.println("DEPOSITE");
	             
			System.out.println("ENTER AMOUNT YOU WANT TO DEPOSITE");
			int amt = scan.nextInt();
			 
			b.deposite(amt);
			System.out.println(" DEPOSIT SUCCESSFULL");
			break;

			case 2:
				System.out.println("ACCOUNT BALANCE");
		      
			b.accountbalance();
		     break;
			case 3 :
				System.out.println("WITHDRAW");
			System.out.println("ENTER AMOUNT TO WITHDRAW");
			 amt = scan.nextInt();
			 b.withdraw(amt);
			 
			break;
			
				 default :{
					 System.out.println("THANK YOU VISIT AGAIN");
				 System.exit(0);
		}
			}
			}
		    }
		  else
			{
				i++;
				System.out.println("INVALID PIN");
			}
		
		if(i==n)
		{
			System.out.println("CONTACT BANK MANAGER");
			
		}
		}
			
         
		 
}
}