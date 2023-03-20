import java.util.Scanner;
public class ForTest3_2 {
	public static void main(String agrs[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("두수를 입력하세요 : ");
		int m = stdin.nextInt();
		int n = stdin.nextInt();
		int i;
		for(i=1;i<=m*n;i++) {
			if((i%n==0)&&(i%m==0))
				break;
		}
		System.out.println("두수의 최소공배수는"+i+"입니다.");
		for(i=n;i<=1;i--) {
			if((n%i==0)&&(m%i==0))
				break;
		}
		if(i==1)
			System.out.println("두수의 최대공약수가 없습니다.");
		else
			System.out.println("두수의 최대공약수는"+i+"입니다.");
	}
}
