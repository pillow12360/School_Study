import java.util.Scanner;
public class KeyboardInput2 {
public static void main (String[]args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("�̸� ���� �����Ը� ������� �Է��Ͻÿ� : ");
	String name = stdIn.next();
	String age = stdIn.next();
	String weigh = stdIn.next();
	
	System.out.println(name+"���� ���̴�"+age+"�̰� �����Դ�"+weigh+"kg �Դϴ�.");
	
}
}