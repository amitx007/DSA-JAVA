package sorted_easy;

public class AverageSalaryExcludingtheMinimumandMaximumSalary 
{
//	https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
	public static void main(String[] args) 
	{
		System.out.println(average(new int[] {4000,3000,1000,2000}));
	}
	public static double average(int[] salary) 
	{
		for (int i = 0; i < salary.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (salary[j-1]>salary[j]) 
				{
					int temp=salary[j-1];
					salary[j-1]=salary[j];
					salary[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		
		double sum=0;
		for (int i = 1; i < salary.length-1; i++) 
		{
			sum+=salary[i];
		}
		return sum/(salary.length-2);
    }

}
