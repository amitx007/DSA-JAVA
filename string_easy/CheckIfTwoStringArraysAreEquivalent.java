package string_easy;

public class CheckIfTwoStringArraysAreEquivalent 
{
//	https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	public static void main(String[] args) 
	{
		System.out.println(arrayStringsAreEqual(new String[] {"ab", "c"},new String[] {"a", "bc"}));
	}
	public static  boolean arrayStringsAreEqual(String[] word1, String[] word2) 
	{
		StringBuilder x=new StringBuilder();
		StringBuilder y=new StringBuilder();
		for (int i = 0; i < word1.length; i++) 
		{
			x.append(word1[i]);
		}
		for (int i = 0; i < word2.length; i++) 
		{
			y.append(word2[i]);
		}
		if (x.toString().equals(y.toString())) 
		{
			return true;
		}
		return false;
    }
}
