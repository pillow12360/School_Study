
public class A1 {
public static void main(String args[]) {
	String slist[] = {"����","����","�뱸","�λ�","��õ"};
	System.out.print("������ �迭 : ");
	for(String s : slist)
		System.out.print(s+" ");
	System.out.println();
	for(int i = 0; i< slist.length/2;i++)
	{
		String temp = slist[i];
		slist[i]=slist[slist.length-i-1];
		slist[slist.length-i-1]=temp;
	}
	System.out.print("�������� ���ġ�� �迭 : ");
	for(String s : slist)
		System.out.print(s+" ");
}
}