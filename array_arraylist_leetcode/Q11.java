package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 
{
//	[Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
	public static void main(String[] args) 
	{
//		[["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]]
//				"color"
//				"silver"
		List<List<String>> input =new ArrayList<List<String>>();
		input.add(new ArrayList<>(Arrays.asList("phone","blue","pixel")));
		input.add(new ArrayList<>(Arrays.asList("computer","silver","lenovo")));
		input.add(new ArrayList<>(Arrays.asList("phone","gold","iphone")));
		System.out.println(countMatches(input, "color", "silver"));
	}
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
	 {
		 int output=0;
		 int column=-1;
		 if (ruleKey.equals("type")) 
		 {
			column= 0;
		}
		 else if (ruleKey.equals("color")) 
		 {
			column=1;
		}
		 else {
			column=2;
		}
		 for (int i = 0; i < items.size(); i++) 
		 {
			if (items.get(i).get(column)==ruleValue) 
			{
				output++;
			}
		}
		 return output;
	 }

}
