package practice_exception;

import java.util.Scanner;
 @SuppressWarnings("serial")
class InputValidAge extends Exception
{
	public InputValidAge(String message)
	{
		super(message);
	}
}
public class Ageverification {
	public static void main(String []args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter age");
		int age=kb.nextInt();
		try{
			if(age<18||age>100)
			{
				throw new InputValidAge("Enter valid age");
			}
			else
			{
				System.out.println("age is valid");
			}
		}
		catch(InputValidAge e)
		{
			
			System.out.println("Exception caught:-" +e.getMessage());
		}
	}

}
