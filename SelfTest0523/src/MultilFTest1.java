import java.util.Scanner;
public class MultilFTest1 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("������ �Է��ϼ��� : ");
	int num = stdin.nextInt();
	if(num==0)
		System.out.print(num+"�� 0�Դϴ�.");
	else if(num<0)
		System.out.print(num+"�� �����Դϴ�.");
	else
		System.out.print(num+"�� ����Դϴ�.");
	
}
}