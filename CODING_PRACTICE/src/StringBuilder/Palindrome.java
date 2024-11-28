package StringBuilder;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		StringBuilder e=new StringBuilder(str);
		String str1=e.reverse().toString();
		if(str.equals(str1))
			
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
