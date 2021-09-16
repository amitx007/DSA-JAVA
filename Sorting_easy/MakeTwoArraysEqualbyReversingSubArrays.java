package sorted_easy;

public class MakeTwoArraysEqualbyReversingSubArrays 
{
//	https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
	public static void main(String[] args) 
	{
		System.out.println(canBeEqual(new int[] {392,360},new int[] {392,360} ));
	}
    public static boolean canBeEqual(int[] target, int[] arr) 
    {
    	  for (int i = 0; i < arr.length-1; i++) 
      	{
  			for (int j = i+1; j>0; j--) 
  			{
  				if (arr[j-1]>arr[j]) 
  				{
  					int temp=arr[j-1];
  					arr[j-1]=arr[j];
  					arr[j]=temp;
  				}
  				else 
  				{
  					break;
  				}
  			}
  		}
          for (int i = 0; i < arr.length-1; i++) 
      	{
      		for (int j = i+1; j>0; j--) 
      		{
      			if (target[j-1]>target[j]) 
      			{
      				int temp=target[j-1];
      				target[j-1]=target[j];
      				target[j]=temp;
      			}
      			else 
      			{
      				break;
      			}
      		}
      	}
      	
      	for (int i = 0; i < arr.length; i++) 
      	{
  			if (target[i]!=arr[i]) 
  			{
  				return false;
  			}
  		}
      	return true;
    }

}
