package Stringques;

public class Stringcompression {

//	public static void main(String[] args) {
//		String str="ssoummm";
//		char []ch=str.toCharArray();
//		int count;
//		for(int i=0;i<ch.length;i++)
//		{
//			count=1;
//			if(i!=ch.length-1)
//			{
//				if(ch[i]==ch[i+1])
//				{
//					count++;
//					System.out.println(ch[i]+""+count);
//					i++;
//				}
//				else if(count==1)
//				{
//					System.out.println(ch[i]+""+count);
//				}
//			
//			}
//			else
//			{
//				System.out.println(ch[i]+""+count);
//			}
//			
//		}
//
//	}
	public static void main(String[] args) {
        String str = "ssoummm";
        char[] ch = str.toCharArray();
        int count;
        String compressed = "";  // Use a string to store the result
 
        for (int i = 0; i < ch.length; i++) {
            count = 1;
            // Count consecutive characters
            while (i < ch.length - 1 && ch[i] == ch[i + 1]) {
                count++;
                i++;
            }
            // Concatenate the character and its count to the result string
            compressed += ch[i] + "" + count;
        }
 
        System.out.println(compressed);
    }
}


