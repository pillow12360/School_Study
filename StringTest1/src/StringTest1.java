
public class StringTest1 {
public static void main(String args[])
{
	String str1 = "아! 대한민국 ";
	String str2 = "Korea";
	System.out.println(str1 + str2);
	System.out.println("아! 대한민국 \nKorea");
	int a = 1000;
	int b = 2000;
	System.out.println(str1 + a + b + "리 금수강산 ");
	//숫자 1000과 2000이 문자열로 인식하여 계산되지 않고 
	//그대로 이어서 출력됨
	System.out.println(str1 + (a + b)+ "리 금수강산 ");
	System.out.println(a+b+"리 금수강산 ");
	System.out.println('3'+"천리 금수강산");
	System.out.println('3'+2997+"리 금수강산");
}
}
