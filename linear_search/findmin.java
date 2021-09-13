package linear_search;

public class findmin 
{
	public static void main(String[] args) 
	{
		int []input= {12,10,56,122,67,1,23,54};
		System.out.println(findmin(input));
		;
	}

	public static int findmin(int[] input) 
	{
		int min=Integer.MAX_VALUE;
		int index=-1;
		for (int i = 0; i < input.length; i++) 
		{
			if (input[i]<min) 
			{
				min=input[i];
				index=i;
			}
		}
		return index;
		
	}

}
