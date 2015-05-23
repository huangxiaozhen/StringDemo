package zhen.huang.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.manipulation.Sortable;

//测试一个字符串在另一个字符串中出现的次数
//两个字符串的最大相同字串
//如何对字符串进行自然排序
//I am a student!  输出 ！student a am I

public class StringDemo5
{
	@Test
    public void test4()
    {
		String str1 = "I am a student!";
		
		String [] str2 = str1.split(" ");
        String str3 = "";
        str2[str2.length-1] = "!"+str2[str2.length-1].substring(0,str2[str2.length-1].length()-1);
        for(int i =0;i<str2.length;i++)
        {
        	str3 =  str3 + " " + str2[str2.length-1-i] ;
        }
        str3 = str3.substring(1);
        System.out.println(str3);
        
    }
	
	@Test
	public void test3()
	{
		String str1 = "asaghvcsd";
		String str2 = sortString(str1);
	}
	
	public String sortString(String str)
	{
		//转成字符数组，利用数组类里面的方法进行排序，然后再把字符数组通过字符串的构造方法转换成字符串
		char[] c =str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	
	
	

	//测试一个字符串在另一个字符串中出现的次数
	// eclipse 中 调试快捷键  F8 直接到下一个断点的位置
	// F6 进行单步执行
	// F5 进行到某一个的调用的方法中
	@Test
	public void test()
	{
		String str1 = "abceabcfabc";
		String str2 = "abc";
		
		
		
		int num;
		
		if (str1.length() > str2.length())
		{
			num = calNum(str1,str2);
		}
		else {
			num = calNum(str2,str1);
		}
		System.out.println("^^" +getNum(str1, str2) );
	}
	
	public int calNum(String maxString,String minString)
	{
		int num = 0;
		for(int start = 0; start <= maxString.length()-minString.length();start++)
		{
			String tempString  = maxString.substring(start,start+minString.length());
			if (tempString.equals(minString))
			{
				num++;
			}
		}
		return num;
	}
	
	public  int getNum(String str1 , String  str2)
	{
		int count = 0;
		int len;
		while( ( len = str1.indexOf(str2) ) != -1  )
		{
			count++;
			str1 = str1.substring(len) ;
			
		}
		return count;
	}
	
	
	// 利用 JUnit 进行测试的时候，最好确保其他的 Test 中没有断点的存在
	@Test
	public void test2()
	{
		String str1 = "waexxabcyyggg";
		String str2 = "ccabczzwae";
		List<String> str3 = getMaxSubString(str1,str2);
		System.out.println(str3);
		
		
	}
	
	public List<String> getMaxSubString(String str1,String str2)
	{
		String maxString  = ( str1.length() > str2.length() ) ? str1 : str2;
		String minString  = ( str1.length() < str2.length() ) ? str1 : str2;
		String tempString = "";
		List<String> list = new ArrayList<String>();
		
		// 对短的字符串进行循环
		for( int x =0 ;x< minString.length();x++)
		{
			//取短的字符串的子串进行比较
			//每次循环从字符串的头部开始，结尾是还剩下字串的字符个数
			//然后指针自增取不同的字串
			for( int y = 0 ,z = minString.length() - x ; z!=minString.length()+1;z++,y++)
			{
				//判断长的字符串中是否存在字串，存在则返回，循环终止
				tempString = minString.substring(y, z);
				if ( maxString.contains(tempString) )
				{
					//有不可能不止一个最大字串的个数，返回符合条件的list
					list.add(tempString);
				}
			}
			
			if (list.size() != 0)
			{
				return list;
			}
			
		}
		return null;
	}
	

}
