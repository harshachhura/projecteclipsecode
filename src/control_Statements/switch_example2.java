package control_Statements;

public class switch_example2 {
	
	public static void main(String[]args)
	{
		int option=1;
		
		int a=5,b=3,c;
		
		switch(option)
		{
		case 1 : c=a+b;
			
		System.out.println("addition="+c);
		break;
		case 2: c=a-b;
		
		System.out.println("sub="+c);
		break;
		default:
			System.out.println("plz enter valid optio");
		
		
	}
	}
	

}
