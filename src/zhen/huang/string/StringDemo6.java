package zhen.huang.string;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

//1. �ַ���������������͵�ת��
//2. �ַ������ֽ������ת��
//3. �ַ������ַ������ת��

public class StringDemo6
{

	//�ַ����������������֮���ת��
	//1. �ַ��� --�� �������������Լ���װ��   ���û����������ͻ����ǰ�װ��� ParseXXX()����
	//2. �������������Լ���װ�� --�� �ַ���  �����ַ����� ValueOf ����
	
	@Test
	public void test() throws UnsupportedEncodingException
	{
		
		//�ַ������ַ������ת��
		String str6 = "abc123�й���";
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
		
		//2.�ַ������ֽ������ת��
		// �ַ��� --�� �ֽ����� 
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
