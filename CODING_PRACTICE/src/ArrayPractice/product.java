package ArrayPractice;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4};
		int mul=1;
		int brr[]= new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			mul=1;
			for( int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					mul=mul*arr[j];
				}
				brr[i]=mul;
			}
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
			
	}

}
