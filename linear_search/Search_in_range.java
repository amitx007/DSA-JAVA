package linear_search;

public class Search_in_range 
{
	public static void main(String[] args) 
	{
		int []input= {12,10,56,122,67,1,23,54};
		int target=67;
		int start=1;
		int end=8;
		System.out.println(searchinrange(input,target,start,end));
	}

	private static int searchinrange(int[] input, int target, int start, int end) 
	{
		if (end>=input.length || start<0) 
		{
			return -1;
		}
		for (int i = start; i <= end; i++) 
		{
			if (input[i]==target) 
			{
				return i;
			}
		}
		return -1;
	}

}
