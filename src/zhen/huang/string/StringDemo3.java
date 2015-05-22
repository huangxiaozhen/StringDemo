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
		
		//9. startWith 判断一个字符串是否以某个字符串开始
		System.out.println( str1.startsWith( "abc" )  );
		
		//10. endwith  判断一个字符串是否以某个字符串结束
		System.out.println( str1.endsWith( "AAA" ) );
		
		//11. reginmatch 判断当前字符串从 fisrtStart 开始 ，与另一个字符串比较是否相等
		System.out.println( str4.regionMatches(0, "bcc", 0, 3) );
		
		
		//12. subString 取出一个字符串中的字串，有一个重载的方法
		System.out.println( str4.substring(1) );
		System.out.println( str4.substring(1, 3));  
		
		//13. replace replace 替换一个字符或者是一个字符串
		String str6 = str2.replace('c', 'b');
		System.err.println( str6 );
		System.out.println( "^^" + str2 );
		String str7 = str2.replaceAll("bcc", "ccb");
		System.err.println( str7 );
		System.err.println( str2 );
		
		//14. trim 除掉字符串中的前后空格
		String str8 = " abc  def ";
		String str9 = str8.trim();
		System.out.println( "---"+ str9 + "---");
		System.out.println("---" +str8+"---");
		
		//15. splite()  根据里面的字符把一个字符串拆分成不同的字串
		String str10 = "abc-def-hj";
		String[] str11 = str10.split("-")	;
		for(String s : str11)
		{
			System.out.println( s );
		}
		
		//16. concat 连接一个字符串
		String str12 = "abc";
		String str13 = str12.concat( "def" );
		System.out.println(str13);
	}

}
