package coreJava;

public class Exceptions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		try//one try block cab be followed by many catch blocks
		{
			int c=a/b;
		}
		catch(ArithmeticException ae)//general catch
		{
			System.out.println("Arithmetic Exception found");
		}

		catch(Exception e)//general catch
		{
			System.out.println("I caught exception");
		}
		
		finally
		{
			System.out.println("executed");
		}
	}

}
