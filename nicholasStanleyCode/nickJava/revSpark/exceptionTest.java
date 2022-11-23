public class ExceptionTest	{	
	public static void main(Stirng[] args)	{
		
		try{ System.out.println("1/0 = " (1 / 0));
		}catch (ArithmeticException e)	{
			System.out.println("Caught anarithmetic exception!");
			e.printStackTrace();
		}finally	{
			System.out.println("this the optional \"finally\" block.")
		}
		System.out.prinln("the code has run normally");
	}
}