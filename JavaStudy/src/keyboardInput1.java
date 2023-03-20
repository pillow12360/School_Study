import java.util.Scanner;
public class keyboardInput1 {
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("몇 번째 프로그램인지 입력하시오 : ");
	String s = stdIn.next(); // 사용자의 입력값을 받는다.
	System.out.println(s+ "번째로 작성해 보는 자바 프로그램 입니다.");
}
}
