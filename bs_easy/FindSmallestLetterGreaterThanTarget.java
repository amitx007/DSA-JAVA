package bs_easy;

public class FindSmallestLetterGreaterThanTarget 
{
//	https://leetcode.com/problems/find-smallest-letter-greater-than-target/
	public static void main(String[] args) 
	{
		char [] letters= {'c','f','j'};
		char target='a';
		System.out.println(nextGreatestLetter(letters, target));
	}
	public static char nextGreatestLetter(char[] letters, char target) 
	{
        int start=0;
        int end=letters.length-1;
        for (; start<=end ; ) 
        {
			int mid=start+(end-start)/2;
			if (letters[mid]>target) 
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
		}
        return letters[start%letters.length];
    }
}
