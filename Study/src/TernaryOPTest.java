import java.util.Scanner;

public class TernaryOPTest {
public static void main (String args[])
{
	Scanner stdin = new Scanner(System.in);
	System.out.println("�� ���� ���ڸ� �Է� : ");
	int a = stdin.nextInt();
	boolean flag;
	flag = ( a % 2 == 0) ? true : false;
	//�Է� ���� ���ڸ� 2�� ���� �������� 0�̸� true �ƴϸ� false ��ȯ
	System.out.println(a+"��(��) ¦���Դϱ�? : ");
	System.out.println(flag);
	
	
	
}
}
