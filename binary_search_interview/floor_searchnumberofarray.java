package binary_search_interview;

public class floor_searchnumberofarray 
{
	public static void main(String[] args) 
	{
		int []input = {2,3,5,9,14,16,18};
		int target=1;
		System.out.println(floorfunction(input, target));
	}
	public static int floorfunction(int arr[],int target) 
	{
		int start=0;
		int end=arr.length-1;
		if (target<arr[start]) 
		{
			return -1;
		}
		for (int i = 0; start<=end; i++) 
		{
			int mid=start+(end-start)/2;
			if (arr[mid]==target) 
			{
				return arr[mid];
			}
			else if (target>arr[mid]) 
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return arr[end];
		
	}

}
