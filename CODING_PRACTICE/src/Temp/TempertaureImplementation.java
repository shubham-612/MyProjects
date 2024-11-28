package Temp;


public class TempertaureImplementation {
	public void setTemperature(int temp)
	{
		try{
			if(temp<-30||temp>50)
			{
				throw new TemperatureInvalidException("Invalid Temperature");
			}
			else
			{
				System.out.println("valid Temperature");
			}
		}
		catch(TemperatureInvalidException e)
		{
			
			System.out.println(e.getMessage());
		}
	}

}
