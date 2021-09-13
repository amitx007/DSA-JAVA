package array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) 
	{
		int arr[]= {1,4,-2,-2,5,-4,3};
		ArrayList<Integer> prefix = new ArrayList<>();
		prefix.add(arr[0]);
		for (int i = 1; i < arr.length; i++) 
		{
			prefix.add(arr[i]+prefix.get(i-1));
		}
	}


}
