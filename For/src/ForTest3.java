import java.util.Scanner;
public class ForTest3 {
public static void main (String agrs[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("�� ���� �Է��ϼ���(�������� ����) : ");
	int n = stdin.nextInt();
	int m = stdin.nextInt();
	int i;
	
	for(i=1;i<=m*n;i++) {
		if((n%i==0)&&(m%i==0))
			break;
	}
	System.out.println("�μ��� �ּҰ������"+i+"�Դϴ�.");
	
	for(i=m;i>=1;i--) {
		if((m%i==0)&&(n%i==0))
				break;
	}
	if (i==0) {
		System.out.println("�μ��� �ִ������� �����ϴ�.");
	}
	else System.out.println("�μ��� �ִ�������"+i+"�Դϴ�.");
	
}
