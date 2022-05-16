package assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int length=arr.length;
		Arrays.sort (arr);
		for (int i=0;i<length;i++)
		//	System.out.println(arr[i]);
		{
			if(arr[i]!=i+1)
			{
			System.out.println(i+1);
			break;
			}
		}
	}

}

