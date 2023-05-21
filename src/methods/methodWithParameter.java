package methods;

public class methodWithParameter {
	public static void main(String[]args)
	{
		add(5,10);
		methodWithParameter  s=new methodWithParameter();
		
		s.mul(2, 4);
	}
	
	public static void add(int no1,int no2)
	{
		int sum=no1+no2;
		System.out.println("addition="+sum);
		
	}
	public void mul(int no1,int no2)
	{
		int mul=no1*no2;
		System.out.println(mul);
	}
	
	

}
