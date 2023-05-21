package constructor;

public class sample5 {
	
	//with parameter constructor or parameterized constructor
	
	int num1;
	int num2;
	sample5(int a ,int b)
	{
	 num1=a;
     num2=b;
		
		//user defined constructor
		
	}
	public void sum()
	{
		int sum1=num1+num2;
		System.out.println(sum1);
	}
	public void mul()
	{
		int mul=num1*num2;
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		sample5 s5=new sample5(2,4);
		s5.sum();
		
//		sample5 s6=new sample5(20,3);
//		s6.mul();
	}
	
	

}
