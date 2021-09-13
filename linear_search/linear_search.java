package linear_search;

public class linear_search 
{
//	time complexity o(n)
	public static void main(String[] args) 
	{
		int []input= {12,10,56,122,67,1,23,54};
		int target=67;
		System.out.println(linaerSearch(input, target));
		
	}
	public static int linaerSearch(int []arr ,int target) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==target) 
			{
				return i ;
			}
		}
		return -1;
	}

}
