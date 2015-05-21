package zhen.huang.string;

public class StringDemo2
{
	 public static void main(String[] args) { 
		    // 以下两条语句创建了1个对象。"凤山"存储在字符串常量池中 
		    String str1 = "凤山"; 
		    String str2 = "凤山"; 
		    System.out.println(str1==str2);//true 
		     
		    //以下两条语句创建了3个对象。"天峨"，存储在字符串常量池中，两个new String()对象存储在堆内存中 
		    String str3 = new String("天峨"); 
		    String str4 = new String("天峨"); 
		    System.out.println(str3==str4);//false 
		     
		    //以下两条语句创建了1个对象。9是存储在栈内存中 
		    int i = 9; 
		    int j = 9; 
		    System.out.println(i==j);//true 
		     
		    //由于没有了装箱，以下两条语句创建了2个对象。两个1对象存储在堆内存中 
		    Integer l1 = new Integer(1); 
		    Integer k1 = new Integer(1); 
		    System.out.println(l1==k1);
		    //以下两条语句创建了1个对象。
		    //对象存储在栈内存中。自动装箱时对于值从127之间的值，使用一个实例。
		    Integer l = 20;//装箱 
		    Integer k = 20;//装箱 
		    System.out.println(l==k);//true 
		//以下两条语句创建了2个对象。i1,i2变量存储在栈内存中，两个256对象存储在堆内存中 
		    Integer i1 = 256; 
		    Integer i2 = 256; 
		    System.out.println(i1==i2);//false 
		  } 

}
