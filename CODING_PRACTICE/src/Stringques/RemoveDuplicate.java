package Stringques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str="soumsahu";
		
		Set<Character> ch=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			ch.add(str.charAt(i));
		}
		for(char q:ch)
		{
			System.out.print(q);
		}

	}

}
