package StringBuilder;

import java.util.regex.Pattern;

public class Stringcontainsonlydigit {

	public static void main(String[] args) {
		String str="m5";
		String regex="^(\\d)$";
//		System.out.println(str.matches("\\d+$"));
//		for(char ch:str.toCharArray())
//		{
//			if("0123456789".indexOf(ch)!=-1)
//			{
//				System.out.println("true");
//			}
//			else
//			{
//				System.out.println("false");
//			}
//		}
		System.out.println(Pattern.matches(regex, str));
//	}

	}
}
