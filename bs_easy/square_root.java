package bs_easy;

public class square_root 
{
//	https://leetcode.com/problems/sqrtx/
	public static void main(String[] args) 
	{
		System.out.println(mySqrt(2147395599));
		
	}
	 public static int mySqrt(int x) 
	 {
		 double start=0;
		 double end=x;
		 for (;start<=end; ) 
		 {
			 double mid=start+((int)(end-start))/2;
			 if (mid*mid==x) 
			 {
				return (int)mid;
			 }
			 else if (mid*mid>x) 
			 {
				end=mid-1;
			 }
			 else 
			 {
				start=mid+1;
			 }
		 }
	     return (int)end;
     }

}
