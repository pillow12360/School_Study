import java.util.Scanner;
public class FanalTest1 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int num = stdin.nextInt();
	if(num<0)
		System.out.println(num+"�� �����Դϴ�.");
	else if(num==0)
		System.out.print("0�Դϴ�.");
	else 
		System.out.print(num+"�� ����Դϴ�.");
}
}
