package array_arraylist;

public class prefix_suffix 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,4,-2,-2,5,-4,3};
		
		
		int []prefix_array=new int[arr.length];
		prefix_array[0]=arr[0];
		for (int i = 1; i < prefix_array.length; i++) 
		{
			prefix_array[i]=arr[i]+prefix_array[i-1];
		}
		for (int i : prefix_array) 
		{
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		
		int []suffix_array=new int[arr.length];
		suffix_array[arr.length-1]=arr[arr.length-1];
		for (int i = arr.length-2; i>=0; i--) 
		{
			suffix_array[i]=suffix_array[i+1]+arr[i];
		}
		for (int i : suffix_array) 
		{
			System.out.print(i+" ");
		}
	}

}
