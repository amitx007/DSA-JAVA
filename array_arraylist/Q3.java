package array_arraylist;
import java.util.Scanner;
public class Q3 
{
	//gold connection codechef
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			int T=sc.nextInt();
			for (int i = 0; i < T; i++) 
			{
				int N=sc.nextInt();
				int []island_goldMax=new int [N];
				for (int j = 0; j < island_goldMax.length; j++) 
				{
					island_goldMax[j]=sc.nextInt();
				}
				int []prefix=new int[N];
				prefix[0]=island_goldMax[0];
				for (int j = 1; j < prefix.length; j++) 
				{
					prefix[j]=prefix[j-1]+island_goldMax[j];
				}
				int Q=sc.nextInt();
				for (int j = 0; j < Q; j++) 
				{
					int Q1=sc.nextInt();
					int Q2=sc.nextInt();
					System.out.println((prefix[Q2-1]-prefix[Q1-1])+island_goldMax[Q1-1]);
				}
			}
		}

}
