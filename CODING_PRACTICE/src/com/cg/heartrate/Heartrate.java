package com.cg.heartrate;

public class Heartrate {

	public float restingheartrate(String str)
	{
		String[] resting = str.split("@");
		String res = resting[0];
		Float rest =Float.valueOf(res);  
		return rest;
	}

	public int age(String str)
	{
		String[] divide = str.split("@");
		String res = divide[1];
		int age =  Integer.valueOf(res);
		return age;
	}
	
	public int maxheart(int age)
	{
		return 220-age;
	}
	
	public float targetheartrate(float resting,int age)
	{
		float maxi = maxheart(age);
		float target = (float) ((maxi-resting)*0.7+resting);
		return target;
	}
	
	public String fitness(float targetheart)
	{
		if(targetheart>120 || targetheart<160)
		{
			return "fit";
		}
		else
		{
			return "unfit";
		}
	}
}