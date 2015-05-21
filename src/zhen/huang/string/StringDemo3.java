package zhen.huang.string;

public class StringDemo3
{
	public static void main(String[] args)
	{
		String str1 = "abcdefghijk";
		String str2 = "abcc";
		
		//1. length() ����ַ����ĳ���
		System.out.println( str1.length() );
		System.out.println( str2.length() );
		
		//2. charAt �õ�ĳ��λ�õ�ֵ
		System.out.println( str1.charAt(0) );
		System.out.println( str2.charAt(3));
		
		//3. equals �Ƚ������ַ����Ƿ����
		System.out.println( str1.equals( str2 ) );
		System.out.println( str2.equals( "abcc" ) );
		
		//4. compareTo �Ƚ������ַ��״γ��ֲ�һ��λ�õĲ�ֵ
		System.out.println( str1.compareTo( "aa" ));
		
		//5. indexof(s) ��¼s�״γ��ֵ����ַ����е�λ��
		String str3 = "def";
		System.out.println( str1.indexOf( str3) );
		
		//6. lastindexof(s) ��¼s���һ�γ������ַ����е�λ��
		System.out.println(str1.lastIndexOf( str3 ));
		
		//7. indexof(s.startpoint) ��ĳ���㿪ʼ�ַ����״γ���
		String str4 = "bcczzbccxxbcc";
		String str5 = "bcc";
		System.out.println( str4.indexOf( str5, 1) );
		
		//8. lastindexof(s.startpoint) ע����������ǴӺ���ǰ����
		System.out.println( str4.lastIndexOf("bcc" ,1) );
		
	}

}
