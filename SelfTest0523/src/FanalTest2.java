import java.util.Scanner;
public class FanalTest2 {
public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("월을 입력하세요 : ");
	int month = stdin.nextInt();
	if(3<=month && month <=5)
		System.out.println("봄입니다.");
	else if(6<=month && month <=8)
		System.out.println("여름입니다.");
	else if (9<=month && month <=11)
		System.out.println("가을 입니다.");
	else if(month==1 || month == 2 || month ==12)
		System.out.println("겨울 입니다.");
	else
		System.out.println("해당하는 계절이 없습니다.");
}
}
