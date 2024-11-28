package StringBuilder;

public class Vowelsandcon {

	public static void main(String[] args) {
		String str="soum";
		int v=0;int c=0;
		for(char ch:str.toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println(v);
		System.out.println(c);
		
		
	}

}
