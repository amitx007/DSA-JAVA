package sorted_easy;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference 
{
	public static void main(String[] args) 
	{
		System.out.println(minimumAbsDifference(new int[] {40,11,26,27,-20}));
	}
	public static List<List<Integer>> minimumAbsDifference(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (arr[j-1]>arr[j]) 
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		List<List<Integer>>output= new ArrayList<List<Integer>>();
		int mindiff=Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) 
		{
			if (Math.abs(arr[i]-arr[i-1])<mindiff) 
			{
				mindiff=Math.abs(arr[i]-arr[i-1]);
			}
		}
		for (int i = 1; i < arr.length; i++) 
		{
			if (Math.abs(arr[i]-arr[i-1])==mindiff) 
			{
				ArrayList<Integer>x=new ArrayList<>();
				x.add(arr[i-1]);
				x.add(arr[i]);
				output.add(x);
			}
		}
		return output;
    }

}
