package variables;

public class non_static_var_samcls {

	int p=2;			// non-static global variable
	public static void main(String[]args)
	{
		non_static_var_samcls cs= new non_static_var_samcls();
		System.out.println(cs.p);		//calling non-static variable from same cls
		
		
		non_Sta_diff_var cs1=new non_Sta_diff_var();
		System.out.println(cs1.d);
		
		
		non_Sta_diff_var cs2=new non_Sta_diff_var();
		System.out.println(cs2.d);
	}
	
	public static void m3()
	{
//		System.out.println(p);		//can't access non-static global variable in static method
		
		
	}
	
	public void m4()
	{
		System.out.println(p);           //we can access in non-static method
		
	}
}
