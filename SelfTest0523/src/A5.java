import java.util.Scanner;
public class A5 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int num = stdin.nextInt();
	if(num < 0)
		System.out.println("���� �Դϴ�.");
	else if(num ==0)
		System.out.println("0�Դϴ�.");
	else 
		System.out.println("��� �Դϴ�.");
}
}
