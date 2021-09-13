package binary_search_interview;

public class findinmountainarray 
{
	public static void main(String[] args) 
	{
		int input[]= {0,1,2,4,2,1};
		int target=3;
		System.out.println(findinmountainarray(input, target));
	}
	public static int findinmountainarray(int []arr,int target) 
	{
		int peak=peakofmountainarray(arr);
		int start=0;
		int end=arr.length-1;
		if (target>arr[peak]) 
		{
			start=peak+1;
		}
		else if (target<arr[peak]) 
		{
			end=peak-1;
		}
		else 
		{
			return  peak;
		}
		for (; start<=end;) 
		{
			int mid=start+((end-start)/2);
			if (target==arr[mid]) 
			{
				return mid;
			}
			else 
			{
				//decreasing
				if (arr[start]>arr[end]) 
				{
					if (target>arr[mid]) 
					{
						end=mid-1;
					}
					else 
					{
						start=mid+1;
					}
				}
//				increasing
				else 
				{
					if (target>arr[mid]) 
					{
						start=mid+1;
					}
					else 
					{
						end=mid-1;
					}
				}
			}
		}
		return -1;
	}
	public static int peakofmountainarray(int arr[]) 
	{
		int start=0;
		int end=arr.length-1;
		for (;start<end;) 
		{
			int mid=start+((end-start)/2);
			if (arr[mid]>arr[mid+1]) 
			{
				end=mid;
			}
			else 
			{
				start=mid+1;
			}
		}
		return start;
	}
}


