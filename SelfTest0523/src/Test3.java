import java.util.Scanner;
public class Test3 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int num = stdin.nextInt();
	System.out.print(num+"�� ����� : ");
	for(int i = 1; i<=num; i++)
	{
		if(num%i==0)
			System.out.print(i+" ");
	}
	
}
}