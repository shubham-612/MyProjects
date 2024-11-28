package ArrayPractice;

public class CommonElement {

	public static void main(String[] args) {
		int []arr= {1,3};
		int[]arr1= {3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
					
				{
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
