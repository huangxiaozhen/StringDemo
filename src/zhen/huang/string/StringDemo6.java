package zhen.huang.string;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

//1. 字符串与基本数据类型的转换
//2. 字符串与字节数组的转换
//3. 字符串与字符数组的转换

public class StringDemo6
{

	//字符串与基本数据类型之间的转换
	//1. 字符串 --》 基本数据类型以及包装类   调用基本数据类型或者是包装类的 ParseXXX()方法
	//2. 基本数据类型以及包装类 --》 字符串  调用字符串的 ValueOf 方法
	
	@Test
	public void test() throws UnsupportedEncodingException
	{
		
		//字符串与字符数组的转化
		String str6 = "abc123中国人";
		char[] c = str6.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			System.out.println( c[i] );
		}
		
		String str7 = new String( c );
		System.out.println(str7);
		
		
		String str1 = "123";
		int a =Integer.parseInt(str1);
		System.out.println(a);
		
		String str2 = String.valueOf(a);
		System.out.println(str2);
		
		int b =456;
		String  str3 = String.valueOf(b);
		System.out.println(str3);
		
		//2.字符串与字节数组的转化
		// 字符串 --》 字节数组 
		String str4 = "abc123";
		byte[] bb = str4.getBytes();
		for(int i = 0 ; i < bb.length ; i++ )
		{
			System.out.println((char)bb[i]);
		}
		
		String str5 = new String( bb );
		System.out.println(str5);
		
	}

}
