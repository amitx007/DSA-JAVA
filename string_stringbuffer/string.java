package string_stringbuffer;

public class string 
{
	public static void main(String[] args) 
	{
		String x=new String("amit");
		String y=new String("amit");
		System.out.println(y);
		System.out.println(x==y);
		
		//pretty printing
		 float a=1.1234f;
		 System.out.printf("modified number is %.8f \n",a);
		
//		 unicode 
		 System.out.println((char)('a'+'b'));
		 System.out.println();
		 // 1 is converted it into wrapper class 1 then it call to tostring() which convert 
		 // 1 to "1" then it get concatinated
		 
		 System.out.println("1"+new Integer(10));
		 
		 StringBuilder am= new StringBuilder();
		for (int i = 0; i <26; i++) 
		{
			am.append((char)('a'+i));
		}
		am.reverse();
		System.out.println(am.toString());
	}

}
      