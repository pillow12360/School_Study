import java.util.Scanner;
public class A5 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	int num = stdin.nextInt();
	if(num < 0)
		System.out.println("음수 입니다.");
	else if(num ==0)
		System.out.println("0입니다.");
	else 
		System.out.println("양수 입니다.");
}
}
