
public class BreakLabelTest1 {
public static void main (String agrs[]) {
	boolean t = true;
	First:{
		Third:{
			System.out.println("Third ��� 'break' ���� ��");
			if(t)break Second;
			System.out.println("Third ��� 'break' ���� ��");
		}
		System.out.println("Second ��� ����");
	}
	System.out.println("First ��� ����");
}






}




