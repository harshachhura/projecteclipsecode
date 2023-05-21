package methods;

public class non_StaticSame {
			
	public static void main(String[]args)
	{
		non_StaticSame obj = new non_StaticSame();
		obj.m1();
		obj.m2();
		
		non_Sta_Diff ob=new non_Sta_Diff();
		ob.s2();
	}
	public void m1()
	{
		System.out.println("Running the non-static method m1 from same class");
	}
	public void m2()
	{
		System.out.println("Running the non-static method m2 same class");
	}
}
