package binary_search_interview;

public class peak_in_mountainArray_or_biotonicarray 
{
	public static void main(String[] args) 
	{
		int []input= {0,2,1,0};
		System.out.println(peakofmountainarray(input));
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
