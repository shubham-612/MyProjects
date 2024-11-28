package com.cg.string_manipulation;

import java.util.Arrays;

public class STRING_ROTATION {
	public static void main(String[] args) {
		String str="soum";
		String str1="msou";
		char []ch=str.toCharArray();
		char []ch1=str1.toCharArray();
		char []ch2=new char[ch.length];
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
			ch2[(j+(i+1))%ch.length]=ch[j];
			}
			if(Arrays.equals(ch2, ch1)) {
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
		if(f==1) {
			System.out.println("a part of string rotation");
		}
		else
		{
			System.out.println(" not a part of string rotation");
		}
 
	}
}
