package zhen.huang.string;

//模拟字符串中的trim方法

//模拟指定位置的字符串的字符交互

public class StringDemo4
{

	public static String trimDemo(String string)
	{
		//1. 判断字符是否为空或者""，如果是则返回null
		if ( string == null || "".equals(string) )
		{
			return null;
			
		}
		
		int startPoint =0 ;
		int endPoint = string.length()-1;
		
		while( startPoint<endPoint && string.charAt( startPoint ) == ' ' )
		{
			startPoint++;
		}
		while (startPoint<endPoint && string.charAt( endPoint  ) == ' ' )
		{
			endPoint--;
		}
		
		return string.substring(startPoint, endPoint);
		
	}
	
	
	public static String reverseString(String string,int startPoint, int endPoint)
	{
		char[] c = string.toCharArray(); //字符串转成字符数组
		
		return reverseArray( c, startPoint, endPoint);
	}
	
	public static String reverseArray(char[] c,int start,int end)
	{
		for( int i=start,j=end ; i<j ;i++,j-- )
		{
			char temp  = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		return new String(c); //字符串换的构造器，里面放入字符数组
	}
	
	//实现指定位置的字符串反转的第二种方法
	public static String reverseString2(String string,int start,int end )
	{
		String str1 = string.substring(0, start-1);
		for(int i = end-1; i>=start-1;i--)
		{
			char c = string.charAt(i);
			str1 = str1 + c;
		}
		str1 = str1 + string.substring(end);
		return str1;
		
	}
	
	
	public static void main(String[] args)
	{
		//测试trim
		/*String str1 = " sasss  ss ".trim();
		System.out.println( "--" + str1 + "---" );*/
		
		
		//测试字符串反转
		String str2 = reverseString2("abcdefg", 2, 5);
		System.out.println(str2);
		
	}
	
}
