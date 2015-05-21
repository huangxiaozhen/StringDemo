package zhen.huang.string;

public class StringDemo1
{
	public static void main(String[] args)
	{
		/**
		 * 字符串是存储在字符串常量池中
		 * 如果写 String str1 = "JavaEE"; 首选会去字符串常量池中寻找
		 * 有没有 JavaEE 这个字符串de存在，如果有 ，栈中的 str 对象直接指向 JavaEE 这个字符串对应的
		 * 地址，如果没有则创建 JavaEE，然后指向 JavaEE 的地址
		 * 
		 * new 出来的对象全部存储在 “堆”空间中
		 * 
		 * 字符串最终都是存放在 “字符串常量池中”
		 * 
		 * hashcode 代表的是字符串常量在 JVM 中的位置
		 * 
		 * 需要理解 String 中的 + 操作，底层是用 StringBuilder 中的append实现的
		 * 
		 * 
		 */
		// 存放在常量池中
		String str1 = "JavaEE"; 
		System.out.println( str1.hashCode() );
		
		// 常量池中已经存在，不再创建新的 
		String str2 = "JavaEE";
		
		//常量池中已经存在，在堆中创建一个新的String对象，值为 JavaEE
		String str3 = new String("JavaEE");
		System.out.println( str1.hashCode() );
		
		//字符串常量相加，直接在
		String str4 = "JavaEE" + "Android"; //字符串的 + 操作时如何进行的
		
		String str5 = "Android";
		
		String str6 = str1 + str5 ;
		
		str5 = str5 + "Handoop";
		
		String str7 = str6.intern();
		String str8 = "JavaEEAndorid";
		
		
		// 判断
		System.out.println( str1 == str2   ); //true
		System.out.println( str1 == str3   ); //false
		System.out.println( str1.equals(str3)  ); //true
		
		System.out.println( str4 == str6   ); //false
		System.out.println( str4.equals(str6)  ); //true
		System.out.println( str4 == str7   ); //false
		System.out.println( str4 == str8   ); //false
		
		Person person1 = new Person("你好");
		Person person2 = new Person("你好");
		System.out.println( person1.name == person2.name );
		
	}
}

class Person
{
	String name;
	Person(String name)
	{
		this.name = name ;
	}
}



