package binary_search;

public class binary_search 
{
	public static void main(String[] args) 
	{
		int []input= {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int target=22;
		System.out.println(binary_search(input,target));
	}

	public static int binary_search(int[] input, int target) 
	{
		int start=0;
		int end=input.length-1;
		for (;start<=end; ) 
		{
			int mid=start+((end-start)/2);
			if (target>input[mid]) 
			{
				start=mid+1;
			}
			else if (target<input[mid]) 
			{
				end=mid-1;
			}
			else 
			{
				return mid;
			}
		}
		return -1;
	}
	

}
