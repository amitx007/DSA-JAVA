package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 
{
//	[Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
	public static void main(String[] args) 
	{
		int []input= {0};
		System.out.println(Arrays.toString((addToArrayForm(input, 0)).toArray()));
		;
	}
	public static List<Integer> addToArrayForm(int[] num, int k) 
	{
        List<Integer> output = new ArrayList<>();
        String x= "";
       
        for (int i = 0; i < num.length; i++) 
        {
			x=x+num[i];
		}
        if (x.equals("")) 
        {
			x=x+0;
		}
        long number=Long.parseLong(x);
        number+=k;
        if (number==0) 
        {
			output.add(0);
		}
        for (; number!=0;) 
        {
			output.add(0,(int)(number%10));
			number=number/10;
		}
        return output;
        
    }
}
