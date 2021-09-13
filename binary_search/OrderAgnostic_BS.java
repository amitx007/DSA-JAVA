package binary_search;

public class OrderAgnostic_BS 
{
	public static void main(String[] args) 
	{
		int []input= {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int []inputx = {99, 80, 75, 22, 11, 10, 5, 2, -3};
		int target=22;
		System.out.println(orderagnostic(inputx,target));
	}

	public static int orderagnostic(int[] input, int target) 
	{
		int start=0;
		int end=input.length-1;
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (input[mid]==target) 
			{
				return mid;
			}
			else 
			{
				if (input[start]<input[end]) 
				{
					if (target>input[mid]) 
					{
						start=mid+1;
					}
					else {
						end=mid-1;
					}
				}
				else 
				{
					if (target<input[mid]) 
					{
						start=mid+1;
					}
					else {
						end=mid-1;
					}
				}
			}
		}
		return -1;
	}

}
