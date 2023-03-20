import java.util.Scanner;
public class SelfTest2 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("두 정수를 입력하세요 : ");
	int m = stdin.nextInt();
	int n = stdin.nextInt();
		int i;
		for(i=1;i<=m*n;i++) {
			if((i%m==0)&&(i%n==0))
				break;
		}
		System.out.println("최소 공배수는 "+i+"입니다.");
		for(i=n;i>=1;i--) {
			if((m%i==0)&&(n%i==0))
				break;
		}
		if(i==1)
			System.out.println("최대 공약수가 없습니다.");
		else
			System.out.println("최대 공약수는 "+i+"입니다.");
}
}