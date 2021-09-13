package binary_search_interview;

public class Q7 
{
//	[Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
	public static void main(String[] args) 
	{
		char []letters = {'e','e','e','e','e','e','n','n','n','n'};
		char target = 'e';
		System.out.println(nextGreatestLetter(letters, target));
	}
	public static char nextGreatestLetter(char[] letters, char target) 
	{
        int start=0;
        int end=letters.length-1;
        for (;start<=end;) 
        {
        	int mid=start+((end-start)/2);
			if (target<letters[mid]) 
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
