package string_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingARule {
//	https://leetcode.com/problems/count-items-matching-a-rule/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<List<String>> items=new ArrayList<>(3);
		for (int i = 0; i <3; i++) 
		{
			List<String>x= new ArrayList<>();
			x.add(sc.next());
			x.add(sc.next());
			x.add(sc.next());
			items.add(x);
		}
		System.out.println(countMatches(items, "color", "silver"));
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
	{
		int col=-1;
		if (ruleKey.equals("type")) 
		{
			col=0;
		}
		else if (ruleKey.equals("color")) 
		{
			col=1;
		}
		else if (ruleKey.equals("name")) 
		{
			col=2;
		}
		int output=0;
		for (int i = 0; i < items.size(); i++) 
		{
			if (ruleValue.equals(items.get(i).get(col))) 
			{
				output++;
			}
		}
		return output;
	}

}
