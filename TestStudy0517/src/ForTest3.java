import java.util.Scanner;
public class ForTest3 {
public static void main(String[]agrs) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("�� ���� ���� �Է� : ");
	int n = stdin.nextInt();
	int m = stdin.nextInt();
	
	int i;
	for(i=1;i<=m*n;i++)
	{
		if((i%n==0)&&(i%m==0))
			break;
	}
	System.out.println("�� �� �� �ּҰ������"+i+"�Դϴ�.");
	for(i=n;i>=1;i--) {
		if((n%i==0)&&(m%i==0))
		 break;
	}
	if(i==1)
		System.out.println("�ִ� ������� �����ϴ�.");
	else
		System.out.println("�μ��� �ִ� �������"+i+"�Դϴ�.");
}
}