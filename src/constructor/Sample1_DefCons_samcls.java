package constructor;

public class Sample1_DefCons_samcls {
	
	//Default constructor created by the compiler at the compilation time
//	Sample1_DefCons_samcls()
//	{
//		
//	}
	
	public static void main(String[]args)
	{
//		int a=20;
//		int b=23;
		
		Sample1_DefCons_samcls s1=new Sample1_DefCons_samcls();
		s1.m1();			//calling method m1 which is non-static
		
		sample2_DefaultCons_diffcls s2=new sample2_DefaultCons_diffcls();
		s2.m2();
		s2.m3();
					
		
	}
	
	public void m1()
	{
		System.out.println("running the non-static regular method from same cls");
	}

}
