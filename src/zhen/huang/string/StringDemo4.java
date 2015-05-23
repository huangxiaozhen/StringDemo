package zhen.huang.string;

//ģ���ַ����е�trim����

//ģ��ָ��λ�õ��ַ������ַ�����

public class StringDemo4
{

	public static String trimDemo(String string)
	{
		//1. �ж��ַ��Ƿ�Ϊ�ջ���""��������򷵻�null
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
		char[] c = string.toCharArray(); //�ַ���ת���ַ�����
		
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
		return new String(c); //�ַ������Ĺ���������������ַ�����
	}
	
	//ʵ��ָ��λ�õ��ַ�����ת�ĵڶ��ַ���
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
		//����trim
		/*String str1 = " sasss  ss ".trim();
		System.out.println( "--" + str1 + "---" );*/
		
		
		//�����ַ�����ת
		String str2 = reverseString2("abcdefg", 2, 5);
		System.out.println(str2);
		
	}
	
}
