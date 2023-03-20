import java.util.Scanner;
public class KeyboardInput {
public static void main (String []agrs) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("몇 번째 프로그램인지 입력하시오 : ");
	String s = stdIn.next();
	System.out.println(s+"번째 프로그램입니다.");
}
	

}
