package methods;

public class method_Without_Parameter
{
	public static void main(String[]args)		//main method
	{
		m11();
		method_Without_Parameter h= new method_Without_Parameter();
		h.m12();
		
		
		without_Para_Diff.m13();
		
		without_Para_Diff j= new without_Para_Diff();
		j.m14();
		
	}
	public static void m11()		//static method without parameter
	{
		System.out.println("Static method call from same class m11");
	}
	
	public void m12()				//non-static without parameter
	{
		System.out.println("non-static method call from same class");
	}

}
