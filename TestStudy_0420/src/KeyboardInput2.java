import java.util.Scanner;
public class KeyboardInput2 {
public static void main (String[]args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("이름 나이 몸무게를 순서대로 입력하시오 : ");
	String name = stdIn.next();
	String age = stdIn.next();
	String weigh = stdIn.next();
	
	System.out.println(name+"님의 나이는"+age+"이고 몸무게는"+weigh+"kg 입니다.");
	
}
}
