package control_Statements;

public class Else_if {
	public static void main(String[]args)
	{
			int marks=67;
			
			if(marks>=90)
				
			{
				System.out.println("pass with distinction");
				
			}
			
			else if(marks>=70)
			{
				System.out.println("first class");
			}
			
			else if(marks>=65)
			{
				System.out.println("second class");
			}
			
			else if(marks>=40)
			{
				System.out.println("third class");
			}
			
			else
			{
				System.out.println("fail");
			}
	}

}
