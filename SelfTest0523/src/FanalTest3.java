import java.util.Scanner;
public class FanalTest3 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	int num = stdin.nextInt();
	System.out.print(num+"의 약수 : ");
	for(int i = 1; i<=num; i++) {
		if(num%i==0)
			System.out.print(i+" ");
	}
}
}
