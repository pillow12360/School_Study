import java.util.Scanner;
public class MultilfTest2 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("���ڸ� �Է� : ");
	int count = stdin.nextInt();
	if(count<0) {
		System.out.println("�Էµ� �� "+count+"�� �����Դϴ�.");
	}
	else if (count ==0)
	{
		System.out.println("�Էµ� ���� 0 �Դϴ�.");
	}
	else {
		System.out.println("�Էµ� �� "+count+"�� ��� �Դϴ�.");
	}
}
}
