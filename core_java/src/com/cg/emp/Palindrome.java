package com.cg.emp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String A = sc.nextLine();
		int x=A.length();
        int j=x-1;
        int i=0;
        int f=0;
        while(i<j)
        {
        if(A.charAt(i)!=A.charAt(j))
        {
            f=1;
            break;
        }
            i++;
            j--;
        }
        if(f==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
		
	}

}
