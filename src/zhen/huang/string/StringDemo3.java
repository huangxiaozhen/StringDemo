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
		
		//9. startWith �ж�һ���ַ����Ƿ���ĳ���ַ�����ʼ
		System.out.println( str1.startsWith( "abc" )  );
		
		//10. endwith  �ж�һ���ַ����Ƿ���ĳ���ַ�������
		System.out.println( str1.endsWith( "AAA" ) );
		
		//11. reginmatch �жϵ�ǰ�ַ����� fisrtStart ��ʼ ������һ���ַ����Ƚ��Ƿ����
		System.out.println( str4.regionMatches(0, "bcc", 0, 3) );
		
		
		//12. subString ȡ��һ���ַ����е��ִ�����һ�����صķ���
		System.out.println( str4.substring(1) );
		System.out.println( str4.substring(1, 3));  
		
		//13. replace replace �滻һ���ַ�������һ���ַ���
		String str6 = str2.replace('c', 'b');
		System.err.println( str6 );
		System.out.println( "^^" + str2 );
		String str7 = str2.replaceAll("bcc", "ccb");
		System.err.println( str7 );
		System.err.println( str2 );
		
		//14. trim �����ַ����е�ǰ��ո�
		String str8 = " abc  def ";
		String str9 = str8.trim();
		System.out.println( "---"+ str9 + "---");
		System.out.println("---" +str8+"---");
		
		//15. splite()  ����������ַ���һ���ַ�����ֳɲ�ͬ���ִ�
		String str10 = "abc-def-hj";
		String[] str11 = str10.split("-")	;
		for(String s : str11)
		{
			System.out.println( s );
		}
		
		//16. concat ����һ���ַ���
		String str12 = "abc";
		String str13 = str12.concat( "def" );
		System.out.println(str13);
	}

}
