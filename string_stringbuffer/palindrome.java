package string_stringbuffer;

public class palindrome 
{
	public static void main(String[] args) 
	{
		 System.out.println(ispalindrome("a"));
	}
	public static boolean  ispalindrome(String s) 
	{ 
		for (int i = 0,j=s.length()-1; i < j; i++,j--) 
		{
			if (s.charAt(i)!=s.charAt(j)) 
			{
				return false;
			}
		}
		return true;
	}

}
