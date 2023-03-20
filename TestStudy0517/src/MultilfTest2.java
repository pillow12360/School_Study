import java.util.Scanner;
public class MultilfTest2 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("숫자를 입력 : ");
	int count = stdin.nextInt();
	if(count<0) {
		System.out.println("입력된 수 "+count+"는 음수입니다.");
	}
	else if (count ==0)
	{
		System.out.println("입력된 수는 0 입니다.");
	}
	else {
		System.out.println("입력된 수 "+count+"는 양수 입니다.");
	}
}
}
