package Arjun;

public class HeartRateCalculator {
	public double restingHeartRate(String str)
	{
		String []words=str.split("@");
		double restinghr=Double.parseDouble(words[0]);
		return	restinghr;
	}
	public int returnAge(String str)
	{
		String []words=str.split("@");
		int age=Integer.parseInt(words[1]);
		return age;
	}
	public int MaxHeartRate(int age)
	{
		int mhr=220-age;
		return mhr;
	}
	public double TargetHeartRate(double rhr,int mhr)
	{
		double thr=(mhr-rhr)*0.7+rhr;
		return thr;
	}
	public void checkFitnessLevel(double thr)
	{
	if(thr>120.0&&thr<160)
	{
		System.out.println("fit");
	}
	else
	{
		System.out.println("Unfit");
	}
	

}
}
