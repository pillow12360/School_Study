import java.util.Scanner;
public class A4 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("�� ���� �Է� : ");
	int m = stdin.nextInt();
	int n = stdin.nextInt();
	int i;
	for(i=1;i<=m*n;i++) {
		if((i%m==0)&&(i%n==0))
			break;
	}
	System.out.println("�μ��� �ּҰ������ "+i+"�Դϴ�.");
	for(i=n;i>=1;i--)
	{
		if((m%i==0)&&(n%i==0))
			break;
	}
	if(i==1)
		System.out.println("�ִ� ������� �����ϴ�.");
	else
		System.out.println("�ִ� ������� "+i+"�Դϴ�.");
}
}
