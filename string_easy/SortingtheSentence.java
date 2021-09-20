package string_easy;


public class SortingtheSentence 
{
//	https://leetcode.com/problems/sorting-the-sentence/
	public static void main(String[] args) 
	{
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
		
	}
	public static String sortSentence(String s) 
	{
		String x[]= s.split(" ");
		
		for (int i = 0; i < x.length;) 
		{
			if (Integer.parseInt((x[i].charAt(x[i].length()-1))+"")==i+1) 
			{
				i++;
			}
			else 
			{
				int index=Integer.parseInt((x[i].charAt(x[i].length()-1))+"")-1;
				String temp=x[index];
				x[index]=x[i];
				x[i]=temp;
			}
		}
		String output="";
		for (int i = 0; i < x.length; i++) 
		{
			output=output+x[i].replace(x[i].charAt(x[i].length()-1),' ');
		}
		output=output.trim();
		return output;
    }
}
