package string_easy;

public class JewelsAndStones 
{
//	https://leetcode.com/problems/jewels-and-stones/
	public static void main(String[] args) 
	{
		System.out.println(numJewelsInStones("z","ZZ" ));
	}
    public static int numJewelsInStones(String jewels, String stones) 
    {
    	int counter=0;
    	for (int i = 0; i < stones.length(); i++) 
    	{
			if (jewels.contains(stones.charAt(i)+"")) 
			{
				counter++;
			}
		}
    	return counter;
    }

}
