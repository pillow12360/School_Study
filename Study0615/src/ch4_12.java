import java.util.Scanner;
public class ch4_12 {
public static void main (String args[]) {
	Scanner stdin = new Scanner(System.in);
	System.out.print("�� �Է�:");
	String month = stdin.next();
	String MtoS="A";
	
	
	switch(month) {
	case "December":
		System.out.println("1���Դϴ�.");
		break;
	case "2��":
		System.out.println("2��");
		MtoS = "�ܿ��Դϴ�.";
	}
	System.out.println(MtoS);
}
}