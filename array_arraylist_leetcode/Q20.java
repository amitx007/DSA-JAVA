package array_arraylist_leetcode;

public class Q20 
{
	public static void main(String[] args) 
	{
		int [][]mat = {{0,1},{1,0}};
		int [][]target = {{1,0},{0,1}};
		System.out.println(findRotation(mat, target));
	}
	public static boolean findRotation(int[][] mat, int[][] target) 
	{
		int rot[][]= rotate(mat);
        for (int i = 0; i < 4; i++) 
        {
        	boolean flag =same(rot, target);
			if (flag) 
			{
				return true;
			}
			rot=rotate(rot);
		}
        return false;
        
	}
	public static int[][] rotate(int[][] mat) 
	{
		int rot[][]=new int[mat.length][mat.length];
		for (int i = 0; i < rot.length; i++) 
		{
			for (int j = 0; j < rot.length; j++) 
			{
				rot[j][mat.length-i-1]=mat[i][j];
			}
		}
		return rot;
	}
	public static  boolean same(int[][] rot, int[][] target) 
	{
		int count=0;
		for (int i = 0; i < target.length; i++) 
		{
			for (int j = 0; j < target.length; j++) 
			{
				if (rot[i][j]==target[i][j]) 
				{
					count++;
				}
			}
		}
		if (count!=(rot.length*rot.length)) 
		{
			return false;
		}
		return true;
	}

}
