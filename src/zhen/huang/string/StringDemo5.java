package zhen.huang.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.manipulation.Sortable;

//����һ���ַ�������һ���ַ����г��ֵĴ���
//�����ַ����������ͬ�ִ�
//��ζ��ַ���������Ȼ����
//I am a student!  ��� ��student a am I

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
		//ת���ַ����飬��������������ķ�����������Ȼ���ٰ��ַ�����ͨ���ַ����Ĺ��췽��ת�����ַ���
		char[] c =str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	
	
	

	//����һ���ַ�������һ���ַ����г��ֵĴ���
	// eclipse �� ���Կ�ݼ�  F8 ֱ�ӵ���һ���ϵ��λ��
	// F6 ���е���ִ��
	// F5 ���е�ĳһ���ĵ��õķ�����
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
	
	
	// ���� JUnit ���в��Ե�ʱ�����ȷ�������� Test ��û�жϵ�Ĵ���
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
		
		// �Զ̵��ַ�������ѭ��
		for( int x =0 ;x< minString.length();x++)
		{
			//ȡ�̵��ַ������Ӵ����бȽ�
			//ÿ��ѭ�����ַ�����ͷ����ʼ����β�ǻ�ʣ���ִ����ַ�����
			//Ȼ��ָ������ȡ��ͬ���ִ�
			for( int y = 0 ,z = minString.length() - x ; z!=minString.length()+1;z++,y++)
			{
				//�жϳ����ַ������Ƿ�����ִ��������򷵻أ�ѭ����ֹ
				tempString = minString.substring(y, z);
				if ( maxString.contains(tempString) )
				{
					//�в����ܲ�ֹһ������ִ��ĸ��������ط���������list
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
