package binary_search_interview;

public class Position_Of_an_element_in_infinitearray 
{
	public static void main(String[] args) 
	{
//		here the size of the array is infinite and if array size is short then while doubling the size of the array
//		it might give error as index out of bound error  
		int input[]= {2,3,5,6,7,8,10,11,12,15,20,23,30,31,32,33};
		int target=15;
		positionofanelement(input, target);
	}
	public static void positionofanelement(int []arr,int target) 
	{
		int start=0;
		int end=1;
		Boolean istrue=false;
		for (int i = 1;target>arr[end]; i++) 
		{
			start=end+1;
			end=end+(int)Math.pow(2, i);
		}
		if (target<=arr[end]) 
		{
			System.out.println(binarysearch(arr, target, start, end));
		}
	}
	public static int binarysearch(int []arr,int target,int start,int end) 
	{
		int first=start;
		int last=end;
		for (;first<=last; ) 
		{
			int mid=start+((end-start)/2);
			if (arr[mid]==target) 
			{
				return mid;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return -1;
		
	}

}

