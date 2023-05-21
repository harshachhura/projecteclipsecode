package methods;

public class Non_static_calls_non_static {
	
	public void m1()
	{
		System.out.println("calling the non-static method m1 in method m2");
	}

	public void m2()
	{
		System.out.println("Calling m1 in m2");
//		Non_static_calls_non_static ob=new Non_static_calls_non_static();
//		ob.m1();
		m1();
		
	}
	public static void main(String[]args)
	{
		Non_static_calls_non_static ob =new Non_static_calls_non_static();
		ob.m2();
		
	}
}
