package ArrayPractice;

import java.util.Arrays;

public class SumofElements {
	
	public int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public int maxvalue(int arr[])
	{
		int i=0;
		int max=arr[0];
		while(i!=arr.length)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			i++;
		}
		return max;
	}
	public void reverse(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void secondlargest(int arr1[])
	{
		System.out.println("sorted");
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr1.length-i-1;j++)
			{
				if(arr1[j]<=arr1[j+1])
				{
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(i==1)
			{
				System.out.println("second largest element is : "+arr1[i]);
			}
		}
		
		
	}
	public void movek(int []arr,int k)
	{
		int j=0;
		int []arr1=new int[arr.length];
		for(int i=(arr.length-k);i<arr.length;i++)
		{
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr.length-k;i++)
		{
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static void arrayissorted(int []arr1)
	{
//		int brr[]=new int[arr1.length];
		int f=0;
//		for(int i=0;i<brr.length;i++)
//		{
//			brr[i]=arr1[i];
//		}
//		for(int i=0;i<arr1.length-1;i++)
//		{
//			for(int j=0;j<arr1.length-i-1;j++)
//			{
//				if(arr1[j]<arr1[j+1])
//				{
//					int temp=arr1[j];
//					arr1[j]=arr1[j+1];
//					arr1[j+1]=temp;
//				}
//			}
//			
//		}
//		for(int i=0;i<brr.length;i++)
//		{
//			if(brr[i]==arr1[i])
//			{
//				f=1;
//			}
//		}
//		if(f==1)
//		{
//			System.out.println("Sorted");
//		}
//		else
//		{
//			System.out.println("not sorted");
//		}
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]<=arr1[i+1])
			{
				f=1;
			}
			else
			{
				f=0;
				break;
			}
			
		}
		if(f==0)
			{
				System.out.println(" not Sorted");
			}
			else
			{
				System.out.println("sorted");
			}
		
	}
	
	public void ArrayMerge(int[]arr,int []arr1)
	{
		int i=0;
		int k=0;
		int j=0;
		int brr[]=new int[arr.length+arr1.length];
		while(i<arr.length)
		{
			brr[k++]=arr[i];
			i++;
		}
		while(j<arr1.length)
		{
			brr[k++]=arr1[j];
			j++;
		}
		Arrays.sort(brr);
		for(int i1=0;i1<brr.length;i1++)
		{
			System.out.print(brr[i1]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,6,4,5};
		int c,m;
		SumofElements k=new SumofElements();
		
		c=k.sum(arr);
		System.out.println("sum is:-"+c);
		m=k.maxvalue(arr);
		System.out.println("Max is:-"+m);
		System.out.println("*******");
		System.out.println("reverse string");
		k.reverse(arr);
		System.out.println("\n*******");
		int []arr1={1,2,9,10,5};
		System.out.println("second largest");
		k.secondlargest(arr1);
		System.out.println("*******");
		System.out.println("move by k to right");
		k.movek(arr, 3);
		System.out.println("*******");
		System.out.println("array is sorted or not");
		arrayissorted(arr);
		System.out.println("*******");
		System.out.println("merge");
		k.ArrayMerge(arr, arr1);
		
	}

}
