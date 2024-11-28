package Arjun;

import java.util.Scanner;

public class Definitions {
	public static void main(String args[])
	{
		HeartRateCalculator h=new HeartRateCalculator();
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter string");
		String str=kb.nextLine();
		double rhr=h.restingHeartRate(str);
		System.out.println("restingHeartRate is:-"+rhr);
		int rA=h.returnAge(str);
		System.out.println("Age is is:-"+rA);
		int mhr=h.MaxHeartRate(rA);
		System.out.println("MaxHEartRate is:-"+mhr);
		double thr=h.TargetHeartRate(rhr, mhr);
		System.out.println("Tareget heart rate is"+thr);
		h.checkFitnessLevel(thr);
		
		
	}
}
