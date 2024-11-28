package Temp;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		TempertaureImplementation t=new TempertaureImplementation();
		Scanner kb=new Scanner(System.in);
		int temp=kb.nextInt();
		t.setTemperature(temp);
		

	}

}
