package string_easy;

public class CounttheNumberofConsistentStrings 
{
	public static void main(String[] args) 
	{
		System.out.println(checkIfPangram("leetcode"));
	}
	public static boolean checkIfPangram(String sentence) 
	{
		for (int i = 0; i < 26; i++) 
		{
			if (sentence.contains((char)('a'+i)+"") )
			{
				sentence=sentence.replace((char)('a'+i), ' ');
			}
		}
		System.out.println(sentence);
		for (int i = 0; i < sentence.length(); i++) 
		{
			if (sentence.charAt(i)!=' ') 
			{
				return false ;
			}
		}
		return true;
    }    

}
