
public class CopyArrayTest1 {
public static void main(String args[]) {
	int num1[]= {10,20,30};
	int num2[]= {40,50,60};
	
	num2=num1; //배열명을 이용하여 복사
	num2[2]=200; //같은 주소값을 가져서 num1의 값도 변경됨
	System.out.print("num1 배열의 값 : ");
	for (int i : num1)
		System.out.print(i+" ");
	System.out.print("\nnum2 배열의 값 : ");
	for(int i : num2)
		System.out.print(i+" ");
	int num3[]= {100,200,300};
	int num4[]= {400,500,600};
	for(int i = 0; i<num3.length;i++)
		num4[i]=num3[i];
	num4[2]=999; //num3배열과 서로 다른 배열이기 때문에 변하지 않는다
	System.out.print("\nnum3 배열의 값 : ");
	for(int i : num3)
		System.out.print(i+" ");
	System.out.print("\nnum4 배열의 값 : ");
	for(int i : num4)
		System.out.print(i+" ");
}
}
