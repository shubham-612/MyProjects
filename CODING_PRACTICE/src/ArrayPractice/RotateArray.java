package ArrayPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class RotateArray {
 
//    public static void rotate(Integer[] nums, int k) {
//        int n = nums.length;
//        k = k % n; 
//        List<Integer> list = Arrays.asList(nums);
//
//        Collections.rotate(list, k);
//
//        list.toArray(nums);
//    }
// 
//    public static void main(String[] args) {
//        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
// 
//        System.out.println("Original array: " + Arrays.toString(nums));
//        rotate(nums, k);
//        System.out.println("Rotated array: " + Arrays.toString(nums));
//    }
	
	public static void main(String[] args)
	{
		int []arr= {1,2,3,4,5};
		int []arr1=new int[arr.length];
		int k=2;
		for(int i=0;i<arr.length;i++)
		{
			arr1[(i+k)%arr.length]=arr[i];//right rotation
		}
		for(int a:arr1)
		{
			System.out.print(a+" ");
		}
	}
}
