package array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//number of the star
		int q=sc.nextInt();//number of views of the star 
		int c=sc.nextInt();//max brightness of the star 
		ArrayList<Integer> stardetail=new ArrayList<>();
		for (int i = 0; i < n; i++) 
		{
			stardetail.add(sc.nextInt());//xi
			stardetail.add(sc.nextInt());//yi
			stardetail.add(sc.nextInt());//c
		}
		int xcordinate=0;
		for (int i = 0; i < args.length; i++) 
		{
			int t=sc.nextInt();
			int x1i=sc.nextInt();
			int y1i=sc.nextInt();
			int x2i=sc.nextInt();
			int y2i=sc.nextInt();
			
		}
	}
}
