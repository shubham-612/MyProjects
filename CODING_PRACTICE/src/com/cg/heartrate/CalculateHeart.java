package com.cg.heartrate;

import java.util.Scanner;

public class CalculateHeart {

	public static void main(String[] args) {
		System.out.println("Enter the heartarte and age");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Heartrate hc = new Heartrate();
		System.out.println("Resting Heart Rate: " + hc.restingheartrate(str));
		float resting = hc.restingheartrate(str);
		System.out.println("Age: " + hc.age(str));
		int age = hc.age(str);
		System.out.println("Maximum Heart Rate : " + hc.maxheart(age));
		System.out.println("Target Heart Rate: " + hc.targetheartrate(resting, age));
		float targetheart = hc.targetheartrate(resting, age);
		System.out.println("fitness level : " + hc.fitness(targetheart));
		sc.close();
	}
}