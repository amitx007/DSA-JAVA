package array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		//civil war
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) 
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Integer>building=new ArrayList<>();
			for (int j = 0; j < n; j++) 
			{
				building.add(j+1);
			}
			ArrayList<Integer>Position= new ArrayList<>();
			for (int j = 0; j < n; j++) 
			{
				Position.add(j+1);
			}
			int positionPointer = 0;
			ArrayList<Integer> output =new ArrayList<Integer>();
			for (int j = 0; j < n;) 
			{
				if (positionPointer<Position.size()) 
				{
					if (Math.abs(building.get(j)-Position.get(positionPointer))==k)
					{
						output.add(Position.get(positionPointer));
						Position.remove(positionPointer);
						j++;
						positionPointer=0;
					}
					else 
					{
						positionPointer++;
					}
				}
				else 
				{
					j++;
					positionPointer=0;
				}
			}

			if (output.size()==n) 
			{
				for (Integer integer : output) 
				{
					System.out.print(integer+" ");
				}
			}
			else 
			{
				System.out.println("CAPTAIN AMERICA EVADES");
			}
		}
		
	}

}
