package bs_easy;

import java.util.ArrayList;
import java.util.List;

public class CheckIfNandItsDoubleExist 
{
//	https://leetcode.com/problems/check-if-n-and-its-double-exist/
	public static void main(String[] args) 
	{
		int []arr= {7,1,15,11};
		System.out.println(checkIfExist(arr));
	}
	public static boolean checkIfExist(int[] arr) 
	{
		List<Integer> list= new ArrayList<>();
		for (int x : arr) 
		{
			if (list.contains(x*2) || (x%2==0 && list.contains(x/2))) 
			{
				return true;
			}
			else 
			{
				list.add(x);
			}
		}
		return false;
    }

}
