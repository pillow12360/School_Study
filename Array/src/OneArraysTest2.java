
public class OneArraysTest2 {
public static void main (String args[])
{
	String slist[]= {"seoul","deajeon","daegu","kwangju","inchon","jeju","busan"};
	System.out.println("������ �迭 : ");
	for(String s : slist)
		System.out.println(s+" ");
	System.out.println();
	for (int i = 0; i <slist.length/2; i++) {
		String temp = slist[i];
		slist[i]=slist[slist.length - i -1];
		slist[slist.length - i -1]=temp;
	}
	System.out.println("�������� ���ġ�� �迭 : ");
	for(String s : slist)
		System.out.println(s+" ");
}
}