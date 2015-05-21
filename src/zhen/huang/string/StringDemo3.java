package zhen.huang.string;

public class StringDemo3
{
	public static void main(String[] args)
	{
		String str1 = "abcdefghijk";
		String str2 = "abcc";
		
		//1. length() 输出字符串的长度
		System.out.println( str1.length() );
		System.out.println( str2.length() );
		
		//2. charAt 得到某个位置的值
		System.out.println( str1.charAt(0) );
		System.out.println( str2.charAt(3));
		
		//3. equals 比较两个字符串是否相等
		System.out.println( str1.equals( str2 ) );
		System.out.println( str2.equals( "abcc" ) );
		
		//4. compareTo 比较两个字符首次出现不一样位置的差值
		System.out.println( str1.compareTo( "aa" ));
		
		//5. indexof(s) 记录s首次出现的在字符串中的位置
		String str3 = "def";
		System.out.println( str1.indexOf( str3) );
		
		//6. lastindexof(s) 记录s最后一次出现在字符串中的位置
		System.out.println(str1.lastIndexOf( str3 ));
		
		//7. indexof(s.startpoint) 从某个点开始字符串首次出现
		String str4 = "bcczzbccxxbcc";
		String str5 = "bcc";
		System.out.println( str4.indexOf( str5, 1) );
		
		//8. lastindexof(s.startpoint) 注意这个方法是从后向前搜索
		System.out.println( str4.lastIndexOf("bcc" ,1) );
		
	}

}
