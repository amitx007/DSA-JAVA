package bs_medium;

import java.util.Arrays;

public class FindaPeakElementII 
{
//	https://leetcode.com/problems/find-a-peak-element-ii/
	public static void main(String[] args) 
	{
		int [][]matrix= {{1,4},{3,2}};
		System.out.println(Arrays.toString(findPeakGrid(matrix)));
	}
	public static int[] findPeakGrid(int[][] mat) 
	{
       for (int i = 0; i < mat.length; i++) 
       {
    	   int []address= {i,findpeak(mat[i])};
    	   boolean ans=surrounding_check(mat, address);
    	   if (ans) 
    	   {
    		   return address;
    	   }
       }
       return new int[] {-1,-1};
    }
	public static int findpeak(int[]is) 
	{
		int index=-1;
		int largest=Integer.MIN_VALUE;
		for (int i = 0; i < is.length; i++) 
		{
			if (is[i]>largest) 
			{
				largest=is[i];
				index=i;
			}
		}
		return index;
	}
	public static boolean surrounding_check(int[][] mat,int address[]) 
	{
		//left
		//address[0]-->row
		//address[1]-->column
		boolean leftclear=false;
		if ((address[1]<mat[0].length-1 && address[1]>0) || address[1]==mat[0].length-1) 
		{
			if (mat[address[0]][address[1]]>mat[address[0]][address[1]-1]) 
			{
				leftclear=true;
			}

		}
		else if (address[1]==0) 
		{
			leftclear=true;
		}
		
		//right
		boolean rightclear=false;
		if ((address[1]<mat[0].length-1 && address[1]>0) || address[1]==0) 
		{
			if (mat[address[0]][address[1]]>mat[address[0]][address[1]+1]) 
			{
				rightclear=true;
			}
		}
		else if (address[1]==(mat[address[0]].length-1)) 
		{
			rightclear=true;
		}
		
		//up
		boolean upclear=false;
		if (address[0]>0) 
		{
			if (mat[address[0]][address[1]]>mat[address[0]-1][address[1]]) 
			{
				upclear=true;
			}
		}
		else if (address[0]==0) 
		{
			upclear=true;
		}


		//down
		boolean downclear=false;
		if (address[0]<mat.length-1) 
		{
			if (mat[address[0]][address[1]]>mat[address[0]+1][address[1]]) 
			{
				downclear=true;
			}
		}
		else if (address[0]==mat.length-1) 
		{
			downclear=true;
		}

		return leftclear&&rightclear&&upclear&&downclear;
	}

}
