package array_arraylist_leetcode;

import java.util.ArrayList;

public class Q10 
{
//	 [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
	public static void main(String[] args) 
	{
		System.out.println((int)'a'+" "+(int)'z');
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	 public static boolean checkIfPangram(String sentence) 
	 {
		 boolean flag1=false;
		 boolean flag2=false;
		 
		 int x=0;
		 for (int i = 0; i < sentence.length(); i++) 
		 {
			if (sentence.charAt(i)<=122 & sentence.charAt(i)>=97) 
			{
				x++;
			}
		}
		 if (x==sentence.length()) 
		 {
			flag1=true;
		}
		 char[] chars = sentence.toCharArray();
		 return true;
		 
	 }

}
