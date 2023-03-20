import java.util.Scanner;
public class Study5_8 {
public static void main (String[]agrs) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = stdin.nextInt();
	System.out.println(num+"의 약수 : ");
	for (int i = 1; i <= num; i++) {
		if(num % i ==0)
			System.out.print(i+" ");
	}
	
}
}
