package linear_search;

public class searchstring 
{
	public static void main(String[] args) 
	{
		String input="Amit";
		char target='A';
		System.out.println(searchstring(input,target));
		
	}

	public static boolean searchstring(String input, char target) 
	{
		for (char i : input.toCharArray()) 
		{
			if (i==target) 
			{
				return true;
			}
		}
		return false;
	}
	

}
