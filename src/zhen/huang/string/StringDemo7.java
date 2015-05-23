package zhen.huang.string;

// 比较 String / StringBuffer / StringBuilder 的三者效率问题

public class StringDemo7
{
	public static void main(String[] args)
	{
		long startTime = 0L;
		long endTime = 0L;

		String textString = "";
		StringBuffer stringBuffer = new StringBuffer("");
		StringBuilder stringBuilder = new StringBuilder("");

		// 计算String的执行时间
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			textString = textString + i;
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("执行 String 所用的时间为：" + (endTime - startTime));

		// 计算stringbuffer的时间
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			stringBuffer.append(i);
		}
		endTime = System.currentTimeMillis();

		System.out.println("执行 String 所用的时间为：" + (endTime - startTime));

		// 计算StringBuilder的时间
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			stringBuilder.append(i);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("执行 String 所用的时间为：" + (endTime - startTime));

	}

}
