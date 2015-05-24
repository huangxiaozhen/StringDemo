package zhen.huang.string;

// ���� StringBuffer ��һЩ���

public class StringBufferDemo
{
	public static void main(String[] args)
	{
		StringBuffer stringBuffer = new StringBuffer();
		//1. append ���ӵķ���
		stringBuffer.append("abc").append("123").append(true);
		System.out.println(stringBuffer);
		
		//2. insert
		stringBuffer.insert(3, "hello");
		System.out.println(stringBuffer);
		
		//3. delete
		stringBuffer.delete(0, 3);
		System.out.println(stringBuffer);
		stringBuffer.deleteCharAt(0);
		System.out.println(stringBuffer);
		
		//4. reverse
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
		//5. indexof
		System.out.println( stringBuffer.indexOf("e") );
		
		//6. setchatat
		stringBuffer.setCharAt(0, 'l');
		System.out.println(stringBuffer);
		
		
	}

}
