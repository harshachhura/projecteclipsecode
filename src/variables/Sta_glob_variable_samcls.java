package variables;

public class Sta_glob_variable_samcls {
	
		static int b=15;		//static global variable	
		
		
		
		
	public static void main(String[]args)
	{
		
		System.out.println(b);		//static variable calling from same class
		
		System.out.println(Different_Sta_glo.c);		//static variable calling from different class
		
		
		
//		m1();			// static method calling from same class
//		Sta_glob_variable_samcls cls= new Sta_glob_variable_samcls();	//non-static from same class
//		cls.m2();
	}
	public static void m1()
	{
		System.out.println(b);			//static global variable can be accessed in static method 
		
	}
	
	public void m2()
	{
		System.out.println(b);			//static global  can also be accessed in non-static method
		
	}

}
