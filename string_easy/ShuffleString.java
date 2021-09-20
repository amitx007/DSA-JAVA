package string_easy;

public class ShuffleString 
{
	public static void main(String[] args) {
		System.out.println(restoreString("abc", new int[]{1,2,0}));
	}
	public static String restoreString(String s, int[] indices) 
	{
		char outarr[]= new char[indices.length];
		for (int i = 0; i < indices.length; i++) 
		{
			outarr[indices[i]]=s.charAt(i);
		}
		String output=String.copyValueOf(outarr);
		return output;
    }

}
