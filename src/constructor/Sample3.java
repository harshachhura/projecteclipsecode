package constructor;

public class Sample3 {
	//variable declaration
	
	int num1;
	int num2;
	
	Sample3()				//without parameter or zero parameter	//constructor is used to initialize the variables/objects
	{
		//variable initialization
		
		 num1=2;
		 num2=3;			
		
	}
	public static void main(String[] args) {
		
		
		Sample3 call=new Sample3();
		call.m1();			//calling the non-static method m1 from same class
		call.m2();			//calling the non-static method m2 from same class
		
		sample4 calls = new sample4();
		calls.x1();
	}
	public void m1()
	{
		
		
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void m2()
	{
		int mul=num1*num2;
		System.out.println(mul);
		
	}
	
	
	

}
