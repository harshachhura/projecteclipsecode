package variables;

public class sample1variable {
	
	 int c=40;		//non-static global variable
	
	public static void main(String[] args) {
		
		
		m1();
		sample1variable s= new sample1variable();			//creating the object for the non-static method for calling
		s.m2();
		
	}

	
	
	public  static void m1()
	{
		int a=34;		//		local variable are confined within the method
		System.out.println(a);
		
		
	}
	
	public void m2()
	{
		int b=35;
		System.out.println(b);		//non-static global variable can only be access in non-static method
		System.out.println(c);
	}
}


