package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=42; 		
		int Reminder=0;
			for (int i=2; i<=n/2; i++) 
			{			
				if(n%i==0)		
			{
				System.out.println(n + " is not a prime number");			
			    Reminder=1;
			    break;
			}
			
			}	
			if(Reminder==0)
			{
				System.out.println(n + " is a prime number");
			}
		
			}
			
			}	


		


