import java.util.Scanner;
public class A3 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("���� �Է��ϼ��� : ");
	int month = stdin.nextInt();
	if(3<=month && month <= 5)
		System.out.println("���Դϴ�.");
	else if(6<=month && month <= 8)
		System.out.println("���� �Դϴ�.");
	else if (9<=month && month <=11)
		System.out.println("���� �Դϴ�.");
	else if(month==2 ||month == 1|| month ==12)
		System.out.println("�ܿ� �Դϴ�.");
	else
		System.out.println("�ش��ϴ� ������ �����ϴ�.");
}
}
