import java.util.Scanner;
public class MultilFTest1 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("정수를 입력하세요 : ");
	int num = stdin.nextInt();
	if(num==0)
		System.out.print(num+"은 0입니다.");
	else if(num<0)
		System.out.print(num+"은 음수입니다.");
	else
		System.out.print(num+"은 양수입니다.");
	
}
}
