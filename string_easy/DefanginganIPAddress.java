package string_easy;

public class DefanginganIPAddress 
{
//	https://leetcode.com/problems/defanging-an-ip-address/
	public static void main(String[] args) 
	{
		System.out.println(defangIPaddr("1.1.1.1"));
	}
	public static String defangIPaddr(String address) 
	{
		StringBuilder output=new StringBuilder();
		for (int i = 0; i < address.length(); i++) 
		{
			if (address.charAt(i)=='.') {
				output.append("[.]");
			}
			else 
			{
				output.append(address.charAt(i));
			}
		}
		return output.toString();
    }

}
