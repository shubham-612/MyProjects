package com.cg.string;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="swami";
//		for(int i=str.length()-1 ; i>=0 ; i--)
//		{
//			System.out.print(str.charAt(i));
//		}
		int i=0;
		int j=str.length()-1;
		while(i<=j)
		{
			//char m=str.charAt(i);
			//char n=str.charAt(j);
			
			//m=n;
			
			i++;
			j--;
			
			
		}
		System.out.println(str);
//		StringBuilder sb=new StringBuilder(str);
//		sb.append("aartu");
//		sb.append("sium");
//		sb.append("shbm");
//		String str1= sb.reverse().toString();
//		//palindrome
//		if(str1.equals(str)) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
//		
//		System.out.println(str1);
		
	}

}
