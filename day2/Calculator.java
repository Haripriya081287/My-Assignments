package weel1.day2;

public class Calculator {
	int sum;
	int result;
	public int add(int a,int b,int c) {
		sum=a+b+c;
		return sum;		
	}
	
  public int mul(int a, int b) {
	  result = a*b;
	  return result;
  }
  
   public void sub(int a, int b){
	   
	   System.out.println(a-b);
   }

	
}
